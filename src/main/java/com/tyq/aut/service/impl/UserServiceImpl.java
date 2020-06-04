package com.tyq.aut.service.impl;

import com.tyq.aut.entity.User;
import com.tyq.aut.mapper.UserMapper;
import com.tyq.aut.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tyq
 * @since 2020-06-02
 */
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


   private  final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> findAll(){
        return  userMapper.findAll();
    }

}
