package com.example.microservice.controller;

import com.example.microservice.entity.User;
import com.example.microservice.service.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserServiceImpl service;

    @PostMapping("/create")
    public ResponseEntity<User> create(@RequestBody User user) {
        log.info("coroller called");
        User user1 = service.saveUser(user);
        log.info("created");
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);

    }

    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAll() {
        List<User> user = service.getAll();
        return ResponseEntity.ok(user);
    }

    @GetMapping("/getId/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable String userId){
        User userById = service.getUserById(userId);
        return ResponseEntity.ok(userById);
    }
}
