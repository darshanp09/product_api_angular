package com.edureka.products.products.controller;

import com.edureka.products.products.entity.User;
import com.edureka.products.products.service.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserRepositoryImpl repository;

    @PostMapping("/user")
    public void saveUser(@RequestBody User user){
        repository.saveUser(user);
    }

    @GetMapping("/")
    public List<User> getUsers(){
        return repository.getAllUsers();
    }
}
