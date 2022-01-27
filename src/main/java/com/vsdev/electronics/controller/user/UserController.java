package com.vsdev.electronics.controller.user;

import com.vsdev.electronics.entity.user.User;
import com.vsdev.electronics.service.users.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/user/{login}")
    public User getUser(@PathVariable String login) {

        return userService.getUser(login);
    }
}
