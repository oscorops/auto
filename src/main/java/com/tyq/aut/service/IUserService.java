package com.tyq.aut.service;

import com.tyq.aut.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tyq
 * @since 2020-06-02
 */
public interface IUserService extends IService<User> {

    public List<User> findAll();
}
