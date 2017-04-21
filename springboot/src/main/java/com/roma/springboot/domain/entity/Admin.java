package com.roma.springboot.domain.entity;

/**
 * Created by roma on 21/04/2017.
 */
public class Admin {

    private Integer id;
    private String username;

    public Admin() {}

    public Admin(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
