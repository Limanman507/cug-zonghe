package com.cug.mall.service;

import com.cug.mall.entity.Good;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IGoodService {

    List<Good> list();

    Good find(Integer goodId);

    int insert(Good good);

    int update(Good good);

}
