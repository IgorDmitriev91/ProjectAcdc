package com.javarush.dmitriev.service;


import java.util.Optional;


public interface AbstractService<T> {
    void create(T t);

    Optional<T> get(long id);

}


