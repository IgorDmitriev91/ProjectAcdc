package com.javarush.dmitriev.entity;

import lombok.Data;


@Data
public class User {

    private Long id;
    private String name;

    public User(String name) {
        this.name = name;
    }

}