package com.example.demo.mapper;

import com.example.demo.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liuxiaobao
 * @since 2023-03-01
 */

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

    List<UserEntity> getAll(UserEntity userEntity);

    Integer getCount(UserEntity userEntity);
}
