package com.example.demo.controller;


import com.example.demo.entity.CarEntity;
import com.example.demo.server.CarService;
import com.example.demo.web.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "汽车详情接口")
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;
    /**
     * 新增汽车信息
     * @param carEntity
     * @return
     */
    @PostMapping("/save")
    @ApiOperation(value = "新增汽车信息")
    public AjaxResult saveCar(@RequestBody CarEntity carEntity){
        carService.save(carEntity);
        return AjaxResult.success("新增汽车信息成功");
    }

    /**
     * 批量删除汽车信息
     * @param carIds
     * @return
     */
    @PostMapping("/delete")
    public AjaxResult deleteCar(@RequestBody List<Long> carIds){
        carService.removeByIds(carIds);
        return AjaxResult.success("删除汽车信息成功");
    }

    /**
     * 修改汽车信息
     * @param carEntity
     * @return
     */
    @PostMapping("/update")
    public AjaxResult updateCar(@RequestBody CarEntity carEntity){
        carService.updateById(carEntity);
        return AjaxResult.success("修改汽车信息成功");
    }

    /**
     * 查询汽车成功
     * @param carEntity
     * @return
     */
    @PostMapping("/select")
    public AjaxResult selectCar(@RequestBody CarEntity carEntity){
        List<CarEntity> list = carService.getAll(carEntity);
        return AjaxResult.success(list);
    }

}
