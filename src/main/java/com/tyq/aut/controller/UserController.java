package com.tyq.aut.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tyq.aut.entity.User;
import com.tyq.aut.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tyq
 * @since 2020-06-02
 */
@RestController
@RequestMapping("/aut/user")
public class UserController {

    private final UserServiceImpl userServiceI;

    public UserController(UserServiceImpl userServiceI) {
        this.userServiceI = userServiceI;
    }


    @RequestMapping("/findall")
    public IPage<User> findAll(){

        IPage<User> page=new Page<>(2,2);

        return userServiceI.page(page);
    }
}
