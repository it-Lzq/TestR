package com.lzq.model;

/**
 * @author 作者:李泽庆
 * @version 创建时间:2020/7/24 12:45
 * @email 邮箱:905866484@qq.com
 * @description 描述：用户
 */
public class User {

    private Long id;

    private String name;

    public User() {
    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
