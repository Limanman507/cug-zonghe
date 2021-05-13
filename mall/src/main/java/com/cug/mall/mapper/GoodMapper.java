package com.cug.mall.mapper;

import com.cug.mall.entity.Good;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodMapper {

    List<Good> findAll();

    int doAdd(Good good);

    int doUpdate(Good good);

    Good findById(Integer goodId);
}
