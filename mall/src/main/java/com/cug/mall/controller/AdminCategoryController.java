package com.cug.mall.controller;

import com.cug.mall.entity.Category;
import com.cug.mall.service.ICategoryService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/admin/category")
@Controller
public class AdminCategoryController {
    @Resource
    private ICategoryService categoryService;

    @RequestMapping("/list")
    public String categoryList(Model model)
    {
        List<Category> categoryList = categoryService.list();
        model.addAttribute("categoryList",categoryList);
        return "/admin/category_list";
    }

    @RequestMapping("/add")
    public String add()
    {
        return "/admin/category_add";
    }

    @RequestMapping("/addSubmit")
    public String addSubmit(Category category)
    {
        categoryService.insert(category);
        return "redirect:/admin/category/list";
    }


    @RequestMapping("/update")
    public String update(Integer categoryId, Model model)
    {
        Category category = categoryService.find(categoryId);
        model.addAttribute("category",category);
        return "/admin/category_update";
    }


    @RequestMapping("/updateSubmit")
    public String updateSubmit(Category category)
    {
        categoryService.update(category);
        return "redirect:/admin/category/list";
    }
}
