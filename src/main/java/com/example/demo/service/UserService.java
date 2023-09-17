package com.example.demo.service;

import com.example.demo.pojo.User;

public interface UserService {
    Boolean checkPassword(User user);

    Boolean exist(String username);

    void register(String username, String password);
}
