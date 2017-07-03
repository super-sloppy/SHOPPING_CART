package com.wukai.shopping.controller;

import com.wukai.shopping.model.TUser;
import com.wukai.shopping.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by 锴 on 2017/6/6.
 */
@Controller
public class UserController {
    @Resource()
    private IUserService userService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String login(@ModelAttribute TUser user){
        return "index";
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String login(TUser user, Model model, HttpSession session){
        TUser usertmp =null;
         usertmp = userService.selectByUsername(user);
        if (usertmp==null){
            System.out.println("用户不存在");
            return "index";
        }
        if (!usertmp.getUserPassword().equals(user.getUserPassword())){
            System.out.println("密码错误");
            return "index";
        }
        if(usertmp.getUserLevel()==1){
            System.out.println("管理员界面");
            session.setAttribute("loginUser",usertmp);
            return "web/adminPage";
        }

        session.setAttribute("loginUser",usertmp);
        int userId=usertmp.getId();
//        model.addAttribute("userId",usertmp);
        System.out.println(userId);
        return "redirect:/web/"+userId+"/userPage";
    }


    @RequestMapping(value = "/web/signUp",method = RequestMethod.GET)
    public String signUp(@ModelAttribute("user") TUser user){
        return "web/signUp";
    }

    @RequestMapping(value ="/web/signUp",method = RequestMethod.POST)
    public String signUp(TUser user, HttpServletRequest request){
        TUser usertmp =null;
        usertmp = userService.selectByUsername(user);
        if(usertmp==null){
            int i=0;
            user.setUserLevel(i);
            userService.insertSelective(user);
            return "redirect:/";
        }
        else {
            return "web/signUp";
        }
    }
    @RequestMapping(value = "/web/resetPwd",method = RequestMethod.GET)
    public String resetPwd(@ModelAttribute("user") TUser user){
        return "web/resetPwd";
    }
    @RequestMapping(value = "/web/resetPwd",method = RequestMethod.POST)
    public String resetPwd(TUser user, HttpServletRequest request){
        TUser usertmp =null;
        usertmp = userService.checkReset(user);
        if(usertmp==null){
            return "web/resetPwd";
        }
        else {

            userService.updatePwd(user);
            return "redirect:/";
        }

    }



    @RequestMapping(value = "/web/tourist",method = RequestMethod.GET)
    public String touristPage(){
        int userId=0;

        return "redirect:/web/"+userId+"/userPage";
    }

}
