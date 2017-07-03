package com.wukai.shopping.controller;

import com.wukai.shopping.service.IOrderService;
import com.wukai.shopping.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by 锴 on 2017/6/10.
 */
@Controller
@RequestMapping("/web/orderManage")
public class OManageController {
    @Resource
    private IOrderService orderService;

    @RequestMapping(value = "{id}/delete",method = RequestMethod.GET)
    public String delete(@PathVariable int id){
        orderService.deleteByPrimaryKey(id);
        return "redirect:/web/orderManage";
    }
}
