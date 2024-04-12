package com.javarush.dmitriev.repository;

import com.javarush.dmitriev.entity.User;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class UserRepository implements AbstractRepository<User> {
    private final Map<Long, User> userMap = new ConcurrentHashMap<>();
    private Long id = 0L;

    @Override
    public void create(User user) {
        user.setId(id++);
        update(user);
    }

    @Override
    public void update(User user) {
        userMap.put(user.getId(), user);
    }

    @Override
    public void delete(User user) {
        userMap.remove(user.getId());
    }

    @Override
    public Collection<User> getAll() {
        return userMap.values();
    }

    @Override
    public Optional<User> get(long id) {
        return Optional.ofNullable(userMap.get(id));
    }
}