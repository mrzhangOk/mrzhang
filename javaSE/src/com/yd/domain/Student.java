package com.yd.domain;

import com.sun.corba.se.impl.orb.ORBSingleton;

/**
 * @author mrzhang
 * @date 2020/6/15 19:51
 **/
public class Student {
    private int age ;
    private String username ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
