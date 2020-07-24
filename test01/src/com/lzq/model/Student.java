package com.lzq.model;

/**
 * @author 作者:李泽庆
 * @version 创建时间:2020/7/24 14:36
 * @email 邮箱:905866484@qq.com
 * @description 描述：
 */
public class Student {
    private Long id;
    private String name;
    private int age;

    public Student(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
