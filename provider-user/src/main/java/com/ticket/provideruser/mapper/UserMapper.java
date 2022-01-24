package com.ticket.provideruser.mapper;


import com.ticket.provideruser.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author : Jayleonc
 * @date : 2022-01-17 14:16
 */
@Mapper
public interface UserMapper {

    List<User> findUser();

    User findById(@Param("id") String id);
}
