package com.example.demo.server.impl;

import com.example.demo.entity.CarEntity;
import com.example.demo.mapper.CarMapper;
import com.example.demo.server.CarService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuxiaobao
 * @since 2023-03-01
 */
@Service
public class CarDO extends ServiceImpl<CarMapper, CarEntity> implements CarService {
    @Autowired
    private CarMapper carMapper;
    @Override
    public List<CarEntity> getAll(CarEntity carEntity) {
        return carMapper.getAll(carEntity);
    }
}
