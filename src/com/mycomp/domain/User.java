package com.mycomp.domain;

import java.util.List;

public class User {
    private String username;
    private Integer age;
    private List hobby;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHobby(List hobby) {
        this.hobby = hobby;
    }

    public String getUsername() {
        return username;
    }

    public Integer getAge() {
        return age;
    }

    public List getHobby() {
        return hobby;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", hobby=" + hobby +
                '}';
    }
}
