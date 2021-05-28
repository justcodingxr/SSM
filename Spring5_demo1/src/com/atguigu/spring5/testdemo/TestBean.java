package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Orders;
import com.atguigu.spring5.User;
import com.atguigu.spring5.bean.Emp;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void testBean1() {
        //测试userService注入userDao属性
       /*  <!--1 service和dao对象创建-->
    <bean id="userService" class="com.atguigu.spring5.service.UserService">
        <!--注入userDao对象
        name属性：类里面属性名称
        ref属性：创建userDao对象bean标签id值
                -->
        <!--Service层使用dao层，userDao又是通过userDaoImpl实现多态的，ref是userDaoImpl类对象的id，UserService是UserService类对象的id；userDao是userService注入的属性名-->
        <property name="userDao" ref="userDaoImpl"></property>
    </bean>
    <bean id="userDaoImpl" class="com.atguigu.spring5.dao.UserDaoImpl"></bean>*/


        //1 加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");

        //2 获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }

    @Test
    public void testBean2() {
        //1 加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");

        //2 获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        emp.add();
    }
}
