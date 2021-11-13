package com;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.domian.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    /*入门案例*/
    public static void main(String[] args) throws IOException {
    //1.读取配置文件
    InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
    //2.创建工厂模式
        SqlSessionFactoryBuilder builder= new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
    //3.使用工厂创建对象
        UserDao userdao = new UserDaoImpl(factory);
    //4.使用userdao对象执行方法
        List<User> users = userdao.findAll();
        for(User user : users){
            System.out.println(user);
        }
        }
}
