package com.wukai.shopping.controller;

import com.wukai.shopping.model.TOrder;
import com.wukai.shopping.service.IGoodService;
import com.wukai.shopping.service.IOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by 锴 on 2017/6/10.
 */
@Controller
public class OrderController {
    @Resource
    private IGoodService goodService;
    @Resource
    private IOrderService orderService;
//    @RequestMapping(value = "/web/{userId}/{id}/toCart",method = RequestMethod.GET)
//    public String toCart(@PathVariable Integer id, @PathVariable Integer userId, Model model, TOrder order){
//        order.setBuyerId(userId);
//        order.setGoodId(id);
//        int i=0;
//        order.setOrderStatu(i);
//        orderService.insertSelective(order);
//        return "redirect:/web/{userId}/userPage";
//    }


}
