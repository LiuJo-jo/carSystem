package com.example.demo.server;

import com.example.demo.entity.CarEntity;
import com.example.demo.entity.PmEntity;
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
public interface PmService extends IService<PmEntity> {

    Map<String,Object> getAll(PmEntity pmEntity);

}
