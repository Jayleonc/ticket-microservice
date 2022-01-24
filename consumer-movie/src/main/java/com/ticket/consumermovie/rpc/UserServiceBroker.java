package com.ticket.consumermovie.rpc;

import com.ticket.consumermovie.vo.UserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author : Jayleonc
 * @date : 2022-01-20 16:00
 */
@Component
@FeignClient(name = "PROVIDER-USER-SERVICE", path = "/provider-user")
public interface UserServiceBroker {

    @GetMapping("/users")
    List<UserVo> findUser();

    @GetMapping("/users/{id}")
    UserVo findUserById(@PathVariable("id") String id);

}
