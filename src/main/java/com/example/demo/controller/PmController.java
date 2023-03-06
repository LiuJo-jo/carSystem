package com.example.demo.controller;


import com.example.demo.entity.PmEntity;
import com.example.demo.server.PmService;
import com.example.demo.web.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liuxiaobao
 * @since 2023-03-01
 */
@RestController
@CrossOrigin
@RequestMapping("/pm-entity")
public class PmController {
    @Autowired
    private PmService PmService;
    /**
     * 新增汽车信息
     * @param PmEntity
     * @return
     */
    @PostMapping("/save")
    public AjaxResult savePm(@RequestBody PmEntity PmEntity){
        PmService.save(PmEntity);
        return AjaxResult.success("新增汽车信息成功");
    }

    /**
     * 批量删除汽车信息
     * @param PmIds
     * @return
     */
    @PostMapping("/delete")
    public AjaxResult deletePm(@RequestBody List<Integer> PmIds){
        PmService.removeByIds(PmIds);
        return AjaxResult.success("删除汽车信息成功");
    }

    /**
     * 修改汽车信息
     * @param PmEntity
     * @return
     */
    @PostMapping("/update")
    public AjaxResult updatePm(@RequestBody PmEntity PmEntity){
        PmService.updateById(PmEntity);
        return AjaxResult.success("修改汽车信息成功");
    }

    /**
     * 查询汽车成功
     * @param PmEntity
     * @return
     */
    @PostMapping("/select")
    public AjaxResult selectPm(@RequestBody PmEntity PmEntity){
        List<PmEntity> list = PmService.getAll(PmEntity);
        return AjaxResult.success("修改汽车信息成功");
    }
}
