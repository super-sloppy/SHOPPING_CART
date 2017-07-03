package com.wukai.shopping.controller;

import com.wukai.shopping.model.TGood;
import com.wukai.shopping.model.TOrder;
import com.wukai.shopping.model.TUser;
import com.wukai.shopping.service.IGoodService;
import com.wukai.shopping.service.IOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 锴 on 2017/6/8.
 */
@Controller
@RequestMapping("/web/{userId}/userPage")
public class GoodController {

    @Resource
    private IGoodService goodService;
    @Resource
    private IOrderService orderService;

    @RequestMapping(method = RequestMethod.GET)
    public String good(Model model){
        List<TGood> goodList = goodService.selectAll();
        model.addAttribute("goodList",goodList);
        return "web/userPage";
    }

    @RequestMapping(value = "/{id}/information",method = RequestMethod.GET)
    public String information(@PathVariable Integer id, Model model){
        TGood good = goodService.selectByPrimaryKey(id);
        model.addAttribute("good",good);
        return "web/goodInformation";
    }
    @RequestMapping(value = "/{id}/toCart",method = RequestMethod.GET)
    public String toCart(@PathVariable Integer id, @PathVariable Integer userId, Model model, TOrder order){

        if(userId==0){
            return "redirect:/";
        }
        order.setBuyerId(userId);
        order.setGoodId(id);
        int i=0;
        order.setOrderStatu(i);
        orderService.insertSelective(order);
        return "redirect:/web/{userId}/userPage";
    }
    @RequestMapping(value = "/myCart",method = RequestMethod.GET)
    public String myCart(@PathVariable Integer userId, Model model){
        List<TOrder> cartList=orderService.selectByUserIdC(userId);
//        List<TOrder> cartList=orderService.selectOrder(userId);
        model.addAttribute("cartList",cartList);
        return "web/myCart";
    }

    @RequestMapping(value = "/Cart" , method = RequestMethod.POST)
    public String myCart(Integer orderid, int goodnum){
        TOrder order=null;
        order=orderService.selectByPrimaryKey(orderid);
        orderService.updateByPrimaryKeySelective(order,goodnum);
        return "redirect:/web/{userId}/userPage/myCart";
    }





    @RequestMapping(value = "/myOrder",method = RequestMethod.GET)
    public String myOrder1(@ModelAttribute TOrder order, Model model,
                        @PathVariable int userId){

        List<TOrder> orderList = orderService.selectOrderByUser(userId);
//        for (TGood g:goodList){
//            System.out.println(g.toString());
//        }
        System.out.println("good");
        model.addAttribute("orderList",orderList);
        return "web/myOrder";
    }
    @RequestMapping(value = "/myOrder/{id}/delete",method = RequestMethod.GET)
    public String deleteOrder(@PathVariable int id){
        orderService.deleteByPrimaryKey(id);
        return "redirect:/web/{userId}/userPage/myOrder";
    }
}
