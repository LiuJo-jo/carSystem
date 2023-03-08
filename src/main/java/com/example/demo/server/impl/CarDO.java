package com.example.demo.server.impl;

import com.example.demo.entity.CarEntity;
import com.example.demo.mapper.CarMapper;
import com.example.demo.server.CarService;
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
public class CarDO extends ServiceImpl<CarMapper, CarEntity> implements CarService {
    @Autowired
    private CarMapper carMapper;
    @Override
    public Map<String,Object> getAll(CarEntity carEntity) {
        List<CarEntity> all = carMapper.getAll(carEntity);

        Integer count = carMapper.getCount(carEntity);
        Map<String,Object> result = new HashMap<>();
        result.put("total",count);
        result.put("data",all);
        return result;
    }
}
