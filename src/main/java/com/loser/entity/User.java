package com.loser.entity;

/**
 * Model 用户
 */

import com.loser.base.BaseModel;

import javax.persistence.*;

public class User extends BaseModel<User> {

    private String username;

    private String password;

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}