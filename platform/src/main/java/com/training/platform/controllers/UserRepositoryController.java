package com.training.platform.controllers;

import com.training.platform.entities.User;
import com.training.platform.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/demo2")

public class UserRepositoryController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/{id}")
    public Optional<User> findById(@PathVariable Integer id){
        // Change from UserRepository to UserService
        Optional<User> user = userRepository.findById(id);
        return user;
    }

    @GetMapping(value = "/test1")
    public List<User> findAll(){
        // Change from UserRepository to UserService
        List<User> users = userRepository.findAll();
        return users;
    }
    @GetMapping(value = "/test2")
    public List<User> findByCityAndActiveAndAge(@RequestParam String city, @RequestParam Integer active, @RequestParam Integer age){
        // Change from UserRepository to UserService
        return userRepository.findByCityAndActiveAndAge(city,active,age);
    }
}
