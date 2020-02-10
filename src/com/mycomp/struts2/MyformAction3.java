package com.mycomp.struts2;

import com.mycomp.domain.User;
import com.opensymphony.xwork2.ActionSupport;

/*
 * 通过domain属性以及在页面中提供表达式的方式接收参数
 *
 * 注意, 想要以这种方式接收参数, 此类中必须有相应的对象和其getter和setter方法.
 * 这种方式会自动的把接受的参数封装成对象
 *
 * 另外, 表单中参数的名称必须是"user.username"这种形式,
 * 其中, "user"是类中那个对象的变量名, "username"是参数名
 * 详见form4.jsp
 */

public class MyformAction3 extends ActionSupport {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getReqParams() {
        System.out.println("通过domain属性以及在页面中提供表达式的方式接收参数:");
        System.out.println(user);
        return null;
    }

}
