package com.dao;

import com.domian.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();


    User findById(Integer userId);

    /**
     * 根据名称模糊查询用户信息
     */
    List<User> findByName(String username);


}
