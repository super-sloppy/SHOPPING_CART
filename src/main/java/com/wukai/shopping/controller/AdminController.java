package com.wukai.shopping.controller;

import com.wukai.shopping.model.TGood;
import com.wukai.shopping.model.TOrder;
import com.wukai.shopping.model.TUser;
import com.wukai.shopping.service.IGoodService;
import com.wukai.shopping.service.IOrderService;
import com.wukai.shopping.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 锴 on 2017/6/10.
 */
@Controller
public class AdminController {
    @Resource
    private IUserService userService;
    @Resource
    private IOrderService orderService;
    @Resource
    private IGoodService goodService;

    @RequestMapping(value = "/web/userManage",method = RequestMethod.GET)
    public String user(@ModelAttribute TUser good,Model model){
        List<TUser> userList = userService.selectAll();
//        for (TGood g:goodList){
//            System.out.println(g.toString());
//        }
        System.out.println("user");
        model.addAttribute("userList",userList);
        return "web/userManage";
    }

    @RequestMapping(value = "/web/goodManage",method = RequestMethod.GET)
    public String good(@ModelAttribute TUser good,Model model){
        List<TGood> goodList = goodService.selectAll();
//        for (TGood g:goodList){
//            System.out.println(g.toString());
//        }
        System.out.println("good");
        model.addAttribute("goodList",goodList);
        return "web/goodManage";
    }

    @RequestMapping(value = "/web/orderManage",method = RequestMethod.GET)
    public String order(@ModelAttribute TOrder order,Model model){
        List<TOrder> orderList = orderService.selectOrder();
//        for (TGood g:goodList){
//            System.out.println(g.toString());
//        }
        for (TOrder g:orderList){
            System.out.println(g.toString());
        }

        model.addAttribute("orderList",orderList);
        return "web/orderManage";
    }
}
