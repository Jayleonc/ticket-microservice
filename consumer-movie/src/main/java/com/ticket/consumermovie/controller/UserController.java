package com.ticket.consumermovie.controller;

import com.ticket.consumermovie.rpc.UserServiceBroker;
import com.ticket.consumermovie.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : Jayleonc
 * @date : 2022-01-17 17:15
 */
@RestController
public class UserController {

    @Autowired
    UserServiceBroker userServiceBroker;

    @GetMapping("/consumer/users")
    public List<UserVo> findUserVo() {
        return userServiceBroker.findUser();
    }

    @GetMapping("/consumer/users/{id}")
    public UserVo findById(@PathVariable("id") String id) {
        return userServiceBroker.findUserById(id);
    }

}
