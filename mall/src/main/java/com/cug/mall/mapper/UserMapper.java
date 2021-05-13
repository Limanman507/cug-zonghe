package com.cug.mall.mapper;

import com.cug.mall.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User find(User u);
}
