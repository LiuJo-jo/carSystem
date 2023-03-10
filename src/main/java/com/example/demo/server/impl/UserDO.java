package com.example.demo.server.impl;

import com.example.demo.entity.UserEntity;
import com.example.demo.mapper.UserMapper;
import com.example.demo.server.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuxiaobao
 * @since 2023-03-01
 */
@Service
public class UserDO extends ServiceImpl<UserMapper, UserEntity> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Map<String, Object> getAll(UserEntity userEntity) {
        List<UserEntity> all = userMapper.getAll(userEntity);
        Integer count = userMapper.getCount(userEntity);
        Map<String, Object> result = new HashMap<>();
        result.put("total", count);
        result.put("data", all);
        return result;
    }

    @Override
    public Map<String, Object> login(UserEntity userEntity) {
        List<UserEntity> results = userMapper.login(userEntity);
        Map<String, Object> result = new HashMap<>();
        if (results.isEmpty()) {
            result.put("msg", "请检查账号或密码是否正确");
        } else {
            result.put("msg", "success");
            result.put("data", results);
        }
        return result;
    }
}
