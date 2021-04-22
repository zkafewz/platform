package com.training.platform.controllers;

import com.training.platform.entities.User;
import com.training.platform.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/demo")
public class UserController{
    @Autowired
    private UserService userService;

   /* @GetMapping(value = "/test5")
    public List<User> index() {
        // Change from UserRepository to UserService
        return userService.findAllByJpqlParamsQuery(0, "bangkok");
    }
    @GetMapping(value = "/test6")
    public List<User> findAllByJpqlQuery(){
        // Change from UserRepository to UserService
        return userService.findAllByJpqlQuery();
    }

    @GetMapping(value = "/test7")
    public List<User> findAllByParamsQuery(@RequestParam String active,@RequestParam String city){
        // Change from UserRepository to UserService
        return userService.findAllByParamsQuery(Integer.parseInt(active),city);
    }
    @GetMapping(value = "/test8")
    public List<User> findAllByQuery(){
        // Change from UserRepository to UserService
        return userService.findAllByQuery();
    }
    @GetMapping(value = "/test9")
    public List<User> findByAgeIn(){
        // Change from UserRepository to UserService
        List<Integer> ages = new ArrayList<Integer>(Arrays.asList(18, 19, 22) );
        return userService.findByAgeIn(ages);
    }
    @GetMapping(value = "/test10")
    public List<User> findByCityAndActiveAndAge(@RequestParam String city,@RequestParam Integer active,@RequestParam Integer age){
        // Change from UserRepository to UserService
        return userService.findByCityAndActiveAndAge(city,active,age);
    }

    @GetMapping(value = "/test10")
    public List<User> findAll(){
        // Change from UserRepository to UserService
        List<User> users = userService.findAll();
        return users;
    }*/

    @GetMapping(value = "/{id}")
    public Optional<User> findById(@PathVariable Integer id){
        // Change from UserRepository to UserService
        Optional<User> user = userService.findById(id);
        return user;
    }
   @GetMapping(value = "/test11")
    public Page<User> findAllByLimit(@RequestParam Integer start, @RequestParam Integer limit, @RequestParam String field){
        // Change from UserRepository to UserService
        return userService.findAllByLimit(start,limit,field);
    }
}
