package com.tyq.aut.mapper;

import com.tyq.aut.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author tyq
 * @since 2020-06-02
 */
@Component
public interface UserMapper extends BaseMapper<User> {

    List<User> findAll();
}
