package com.dao.impl;

import com.dao.UserDao;
import com.domian.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements UserDao{

    private SqlSessionFactory factory;
    public UserDaoImpl(SqlSessionFactory factory){
        this.factory=factory;
    }
    public List<User> findAll() {
        //1.使用工厂
        SqlSession session = factory.openSession();
        //2.执行所有 查询方法
        List<User> users=session.selectList("com.dao.UserDao.findAll");//从配置文件确定方法
        session.close();
        return  users;
    }
}
