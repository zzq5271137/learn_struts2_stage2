package com.mycomp.struts2;

import com.mycomp.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/*
 * 通过ModelDrive(模型驱动)的方式接收参数
 * 需要实现ModelDriven<>并传入泛型(你想要封装的对象类型)
 * 并且重写getModel()方法(返回自己定义的成员变量)
 * 详见form5.jsp
 */

public class MyformAction4 extends ActionSupport implements ModelDriven<User> {
    private User user = new User(); // 直接new好

    @Override
    public User getModel() {
        return user;
    }

    public String getReqParams() {
        System.out.println("通过ModelDrive(模型驱动)的方式接收参数:");
        System.out.println(user);
        return null;
    }

}
