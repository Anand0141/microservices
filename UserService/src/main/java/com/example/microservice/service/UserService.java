package com.example.microservice.service;

import com.example.microservice.entity.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    public User saveUser(User user);

    public List<User> getAll();

    public User getUserById(String userId);


    //TODO:update
    //TODO:delete

}
