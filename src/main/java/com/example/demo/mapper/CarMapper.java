package com.example.demo.mapper;

import com.example.demo.entity.CarEntity;
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
public interface CarMapper extends BaseMapper<CarEntity> {

    List<CarEntity> getAll(CarEntity carEntity);

    Integer getCount(CarEntity carEntity);
}
