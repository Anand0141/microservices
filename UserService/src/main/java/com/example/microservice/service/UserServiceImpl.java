package com.example.microservice.service;

import com.example.microservice.entity.User;
import com.example.microservice.exception.ResourceNotFoundException;
import com.example.microservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User saveUser(User user) {
        String Uid= UUID.randomUUID().toString();
        user.setUserID(Uid);
        log.info("service called");
        return repository.save(user);
    }

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public User getUserById(String userId) {
        return repository.findById(userId).orElseThrow(() -> new ResourceNotFoundException());
    }
}
