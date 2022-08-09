package com.harsh.springboot.user.controller;

import com.harsh.springboot.user.entity.User;
import com.harsh.springboot.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/adduser")
    public User addUser(@RequestBody User user)
    {
        return service.saveUser(user);
    }

    @PostMapping("/addusers")
    public List<User> addUsers(@RequestBody List<User> users)
    {

        return service.saveUsers(users);
    }

    @GetMapping("/all")
    public List<User> findAllUser()
    {
        return service.getUser();
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable long id)
    {
        return service.getUserById(id);
    }

    @GetMapping("/name/{name}")
    public User findUserByName(@PathVariable String name)
    {
        return service.getUserByName(name);
    }


}
