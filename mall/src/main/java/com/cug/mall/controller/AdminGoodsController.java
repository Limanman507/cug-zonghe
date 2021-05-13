package com.cug.mall.controller;

import com.cug.mall.entity.Category;
import com.cug.mall.entity.Good;
import com.cug.mall.service.ICategoryService;
import com.cug.mall.service.IGoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RequestMapping("/admin/goods")

@Controller
public class AdminGoodsController {
    @Resource
    private IGoodService goodService;

    @Resource
    private ICategoryService categoryService;

    @RequestMapping("/list")
    public String goodsList(Model model)
    {
        List<Good> goodList = goodService.list();
        model.addAttribute("goodList",goodList);
        return "/admin/goods_list";
    }

    @RequestMapping("/add")
    public String goodAdd(Model model)
    {
        List<Category> categoryList = categoryService.list();
        model.addAttribute("categoryList",categoryList);
        return "/admin/goods_add";
    }


    @RequestMapping("/addSubmit")
    public String addSubmit(Good good, MultipartFile file)
    {
        String imgFile = null;
        if(file.isEmpty() == true)
        {
            imgFile = "/upfile/defaultImg.jpg";
        }
        else
        {
            String newFile = UUID.randomUUID() + "-" + file.getOriginalFilename();
            File f = new File("F:/MallProjImg",newFile);

            if(!f.getParentFile().exists())
            {
                f.mkdir();
            }

            try {
                file.transferTo(f);
                imgFile = "/upfile/" + newFile;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        good.setPicture(imgFile);
        goodService.insert(good);
        return "redirect:/admin/goods/list";
    }

    @RequestMapping("/update")
    public String update(Integer goodId,Model model)
    {
        Good good = goodService.find(goodId);
        model.addAttribute("good",good);
        List<Category> categoryList = categoryService.list();
        model.addAttribute("categoryList",categoryList);
        return "/admin/goods_update";
    }

    @RequestMapping("/updateSubmit")
    public String updateSubmit(Good good,MultipartFile file)
    {
        if(file.isEmpty() == false)
        {
            String newFile = UUID.randomUUID() + "-" + file.getOriginalFilename();
            File f = new File("F:/MallProjImg",newFile);

            if(!f.getParentFile().exists())
            {
                f.mkdir();
            }

            try {
                file.transferTo(f);
                good.setPicture("/upfile/" + newFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        goodService.update(good);
        return "redirect:/admin/goods/list";
    }
}
