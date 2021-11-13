package com.dao;

import com.domian.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();
}
