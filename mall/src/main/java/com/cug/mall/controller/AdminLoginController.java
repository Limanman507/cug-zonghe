package com.cug.mall.controller;

import com.cug.mall.entity.User;
import com.cug.mall.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
@RequestMapping("/admin")
@Controller
public class AdminLoginController {
    //定义业务对象
    @Resource
    IUserService userService;

    @RequestMapping("/loginShow")
    public String loginShow()
    {
        System.out.print("loginShow");
        return "/admin/login";
    }

    @RequestMapping("/loginSubmit")
    public String loginSubmit(User u, HttpSession httpSession, Model model)
    {
        User tempUser = userService.adminLogin(u);
        if(tempUser == null)
        {
            model.addAttribute("err","用户名或者密码不正确");
            return "/admin/login";
        }

        httpSession.setAttribute("adminUser",u);
        return "/admin/index";
    }

}
