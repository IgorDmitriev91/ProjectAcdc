package com.javarush.dmitriev.service;

import com.javarush.dmitriev.entity.User;
import com.javarush.dmitriev.repository.UserRepository;

import java.util.Optional;

public class UserService implements AbstractService<User> {
    public UserRepository userRepository;
    public static  UserService userService;

    public static UserService getInstance() {
        if (userService == null) {
            userService = new UserService();
        }
        return userService;
    }


    private UserService() {
        userRepository = new UserRepository();
    }


    @Override
    public void create(User user) {
        userRepository.create(user);
    }

    @Override
    public Optional<User> get(long id) {
        return userRepository.get(id);
    }
}