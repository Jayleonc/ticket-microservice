package com.ticket.provideruser.domain;

/**
 * @author : Jayleonc
 * @date : 2022-01-17 14:07
 */
public class User {
    private String id;
    private String userName;
    private String name;
    private Integer age;
    private String email;

    public User() {
    }

    public User(String id, String userName, String name, Integer age, String email) {
        this.id = id;
        this.userName = userName;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
