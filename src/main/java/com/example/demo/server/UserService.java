package com.example.demo.server;

import com.example.demo.entity.UserEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liuxiaobao
 * @since 2023-03-01
 */
public interface UserService extends IService<UserEntity> {

    Map<String, Object> getAll(UserEntity userEntity);

    Map<String, Object> login(UserEntity userEntity);
}
