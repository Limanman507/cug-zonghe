package com.cug.mall.mapper;

import com.cug.mall.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    List<Category> findAll();

    int doAdd(Category category);

    Category findById(Integer categoryId);

    int doUpdate(Category category);



}
