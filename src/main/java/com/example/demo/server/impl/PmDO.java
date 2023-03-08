package com.example.demo.server.impl;

import com.example.demo.entity.CarEntity;
import com.example.demo.entity.PmEntity;
import com.example.demo.mapper.PmMapper;
import com.example.demo.server.PmService;
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
public class PmDO extends ServiceImpl<PmMapper, PmEntity> implements PmService {

    @Autowired
    private PmMapper pmMapper;

    @Override
    public Map<String,Object> getAll(PmEntity pmEntity) {
        List<PmEntity> all = pmMapper.getAll(pmEntity);

        Integer count = pmMapper.getCount(pmEntity);
        Map<String,Object> result = new HashMap<>();
        result.put("total",count);
        result.put("data",all);
        return result;
    }
}
