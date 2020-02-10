package com.mycomp.struts2;

import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/*
 * 通过提供属性set方法的方式接收参数.
 *
 * 注意点: 类的属性名称一定要与请求中的参数名称相同, 而且一定要提供setter方法.
 * 此种方式无法自动封装成对象
 *
 * 此种方式一般只用于接受少量参数.
 */

public class MyformAction2 extends ActionSupport {
    private String username;
    private Integer age;
    private List<String> hobby;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public String getReqParams() {
        System.out.println("通过提供属性set方法的方式接收参数:");
        System.out.println(username);
        System.out.println(age);
        System.out.println(hobby);
        return null;
    }

}
