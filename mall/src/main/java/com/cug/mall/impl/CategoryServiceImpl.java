package com.cug.mall.impl;

import com.cug.mall.entity.Category;
import com.cug.mall.mapper.CategoryMapper;
import com.cug.mall.service.ICategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> list() {
        return categoryMapper.findAll();
    }

    @Override
    public int insert(Category category) {
        return categoryMapper.doAdd(category);
    }

    @Override
    public Category find(Integer categoryId) {
        return categoryMapper.findById(categoryId);
    }

    @Override
    public int update(Category category) {
        return categoryMapper.doUpdate(category);
    }
}
