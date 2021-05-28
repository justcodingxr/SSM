package com.atguigu.spring5.bean;

import java.util.Arrays;

//员工类
public class Emp {
    private String ename;
    private String gender;
    //员工属于某一个部门，使用对象形式表示
    private Dept dept;

    //生成dept的get方法
    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
//    toString方法是一个非常特殊的方法，它是一个“自我描述”方法，该方法通常用于实现这样一个
//    功能:当程序员直接打印该对象时，系统将会输出该对象的“自我描述”信息，用以告诉外界该对象
//    具有的状态信息。
    public void add() {
        System.out.println(ename+"::"+gender+"::"+dept);
    }
}
