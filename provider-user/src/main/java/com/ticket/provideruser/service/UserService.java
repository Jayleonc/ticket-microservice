package com.ticket.provideruser.service;

import com.ticket.provideruser.domain.User;

import java.util.List;

/**
 * @author : Jayleonc
 * @date : 2022-01-17 14:33
 */
public interface UserService {
    List<User> findUser();

    User findById(String id);
}
