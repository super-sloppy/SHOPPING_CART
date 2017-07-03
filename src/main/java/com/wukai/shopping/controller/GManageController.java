package com.wukai.shopping.controller;

import com.wukai.shopping.model.TGood;
import com.wukai.shopping.service.IGoodService;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by 锴 on 2017/6/10.
 */
@Controller
@RequestMapping("/web/goodManage")
public class GManageController {
    @Resource
    private IGoodService goodService;

    @RequestMapping(value = "{id}/delete",method = RequestMethod.GET)
    public String delete(@PathVariable int id){
        goodService.deleteByPrimaryKey(id);
        return "redirect:/web/goodManage";
    }

    @RequestMapping(value = "/goodAdd",method = RequestMethod.GET)
    public String add(@ModelAttribute("good") TGood good,
                         Model model){

        return "web/goodAdd";
    }


    @RequestMapping(value = "/goodAdd",method = RequestMethod.POST)
    public String add( TGood good,
                      MultipartFile multipartFile, HttpServletRequest request){
        goodService.insertSelective(good);
        String realPath =  request.getSession().getServletContext().getRealPath("/static/upload");
        String imgUrl = "\\static\\upload\\good_"+good.getId()+".jpg";
        if (!multipartFile.isEmpty()){
            File img = new File(realPath+"/good_"+good.getId()+".jpg");
            try {
                FileUtils.copyInputStreamToFile(multipartFile.getInputStream(),img);
            } catch (IOException e) {
                e.printStackTrace();
            }
            good.setImageUrl(imgUrl);
            goodService.updateByPrimaryKeySelective(good);
        }
                System.out.println("add-->");
        return "redirect:/web/goodManage";
    }
}
