package com.example.demo.server.impl;

import com.example.demo.entity.PmEntity;
import com.example.demo.mapper.PmMapper;
import com.example.demo.server.PmService;
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
public class PmDO extends ServiceImpl<PmMapper, PmEntity> implements PmService {

    @Autowired
    private PmMapper pmMapper;

    @Override
    public List<PmEntity> getAll(PmEntity pmEntity) {
        return pmMapper.getAll(pmEntity);
    }
}
