package ru.springboot.springboot_app.service;

import ru.springboot.springboot_app.models.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findOne(Long id);
    void save(User user);
    void update(Long id, User user);
    void delete(Long id);
}
