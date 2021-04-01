package com.wang.blog.controller;

import com.wang.blog.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxiang
 * @since 2021/3/31 17:38
 */
@RestController
@RequestMapping("urs")
public class UserController {

    @GetMapping("/info")
    public User getUser(){
        User user = new User("wang",26);
        return user;
    }
}
