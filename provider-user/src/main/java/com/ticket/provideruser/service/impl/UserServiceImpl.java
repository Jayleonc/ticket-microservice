package com.ticket.provideruser.service.impl;

import com.ticket.provideruser.domain.User;
import com.ticket.provideruser.mapper.UserMapper;
import com.ticket.provideruser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Jayleonc
 * @date : 2022-01-17 14:34
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findUser() {
        return userMapper.findUser();
    }

    @Override
    public User findById(String id) {
        return userMapper.findById(id);
    }
}
