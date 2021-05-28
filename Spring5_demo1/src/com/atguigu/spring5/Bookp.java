package com.atguigu.spring5;

/**
 * 演示使用set方法进行注入属性
 */
public class Bookp {
    //创建属性
    private String bname;
    private String bauthor;


    //创建属性对应的set方法
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }
    public void bookpTest() {
        System.out.println(bname+"::"+bauthor);
    }
}