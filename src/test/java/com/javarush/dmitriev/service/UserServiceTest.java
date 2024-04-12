package com.javarush.dmitriev.service;

import com.javarush.dmitriev.entity.User;
import com.javarush.dmitriev.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    private UserService userService;
    private UserRepository userRepository;

    @BeforeEach
    public void setUp() {
        userService = UserService.getInstance();
        userRepository = Mockito.mock(UserRepository.class);
        userService.userRepository = userRepository;
    }

    @Test
    public void createUser() {
        User user = new User("testUser");
        userService.create(user);
        Mockito.verify(userRepository).create(user);
    }

    @Test
    public void getUserWhenUserExist() {
        long id = 1L;
        User user = new User("testUser");
        Mockito.when(userRepository.get(id)).thenReturn(Optional.of(user));
        Optional<User> actualUser = userService.get(id);
        assertEquals(Optional.of(user), actualUser);
    }

    @Test
    public void getUserWhenIsNull() {
        long id = 1L;
        Mockito.when(userRepository.get(id)).thenReturn(Optional.empty());
        Optional<User> actualUser = userService.get(id);
        assertEquals(Optional.empty(), actualUser);
    }
}