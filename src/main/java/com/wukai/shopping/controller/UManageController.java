package com.wukai.shopping.controller;

import com.wukai.shopping.model.TGood;
import com.wukai.shopping.model.TUser;
import com.wukai.shopping.service.IGoodService;
import com.wukai.shopping.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 锴 on 2017/6/10.
 */
@Controller
@RequestMapping("/web/userManage")
public class UManageController {
    @Resource
    private IUserService userService;

    @RequestMapping(value = "{id}/delete",method = RequestMethod.GET)
    public String delete(@PathVariable int id){
        userService.deleteByPrimaryKey(id);
        return "redirect:/web/userManage";
    }

}
