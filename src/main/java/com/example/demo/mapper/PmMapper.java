package com.example.demo.mapper;

import com.example.demo.entity.PmEntity;
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
public interface PmMapper extends BaseMapper<PmEntity> {

    List<PmEntity> getAll(PmEntity pmEntity);
}
