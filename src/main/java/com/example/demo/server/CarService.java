package com.example.demo.server;

import com.example.demo.entity.CarEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liuxiaobao
 * @since 2023-03-01
 */
public interface CarService extends IService<CarEntity> {

    List<CarEntity> getAll(CarEntity carEntity);
}
