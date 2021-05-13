package com.cug.mall.impl;

import com.cug.mall.entity.User;
import com.cug.mall.mapper.UserMapper;
import com.cug.mall.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {

    //定义mapper数据访问对象
    @Resource
    private UserMapper userMapper;

    @Override
    public User adminLogin(User u) {
        return userMapper.find(u);
    }
}
