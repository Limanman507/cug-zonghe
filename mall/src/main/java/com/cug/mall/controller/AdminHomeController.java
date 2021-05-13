package com.cug.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminHomeController {

    @RequestMapping("/welcome")
    public String welcome()
    {
        return "/admin/welcome";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession httpSession)
    {
        httpSession.invalidate();
        return "/admin/login";
    }
}
