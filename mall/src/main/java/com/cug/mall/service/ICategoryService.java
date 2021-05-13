package com.cug.mall.service;

import com.cug.mall.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICategoryService {

    List<Category> list();

    int insert(Category category);

    Category find(Integer categoryId);

    int update(Category category);

}
