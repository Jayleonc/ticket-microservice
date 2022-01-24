package com.ticket.provideruser.controller;

import com.ticket.provideruser.domain.User;
import com.ticket.provideruser.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : Jayleonc
 * @date : 2022-01-17 14:35
 */

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> findUser() {
        return userService.findUser();
    }

    @GetMapping("/users/{id}")
    public User findById(@PathVariable("id") String id) {
        return userService.findById(id);
    }

}
