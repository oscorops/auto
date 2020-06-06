package com.tyq.aut.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tyq.aut.entity.User;
import com.tyq.aut.service.impl.UserServiceImpl;
import com.tyq.aut.util.SmsUtil;
import com.tyq.aut.util.TemplateCode;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
@RequestMapping("/user")
public class UserController {

    private final UserServiceImpl userServiceI;

    public UserController(UserServiceImpl userServiceI) {
        this.userServiceI = userServiceI;
    }


    @GetMapping("/findall")
    public IPage<User> findAll() {

        IPage<User> page = new Page<>(2, 2);

        return userServiceI.page(page);
    }

    @GetMapping("/sms/{phone}")
    public String aliyunsms(@PathVariable("phone") String phone) {


        HashMap<String, Object> map = new HashMap<>();

        String code = String.valueOf((int) ((Math.random() * 9 + 1) * 1000));

        map.put("code",code);

        SmsUtil sms = new SmsUtil();

        if (sms.sendMsm(phone, map, TemplateCode.os)) {
            return "send  success"+code+"发送至"+phone;
        } else {
            return "send false";
        }


    }
}
