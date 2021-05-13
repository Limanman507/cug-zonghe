package com.cug.mall.service;


import com.cug.mall.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    //login
    public User adminLogin(User u);
}
