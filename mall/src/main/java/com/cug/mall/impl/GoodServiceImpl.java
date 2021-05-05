package com.cug.mall.impl;

import com.cug.mall.entity.Good;
import com.cug.mall.mapper.GoodMapper;
import com.cug.mall.service.IGoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodServiceImpl implements IGoodService {

    @Resource
    GoodMapper goodMapper;

    @Override
    public List<Good> list() {
        return goodMapper.findAll();
    }

    @Override
    public Good find(Integer goodId) {
        return goodMapper.findById(goodId);
    }

    @Override
    public int insert(Good good) {

        System.out.println("do insert");
        return goodMapper.doAdd(good);
    }

    @Override
    public int update(Good good) {
        System.out.println("do update");
        return goodMapper.doUpdate(good);
    }
}
