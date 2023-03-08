<<<<<<< HEAD
package com.example.demo.controller;


import com.example.demo.entity.UserEntity;
import com.example.demo.server.UserService;
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
@RequestMapping("/user-entity")
public class UserController {
    @Autowired
    private UserService UserService;
    /**
     * 新增汽车信息
     * @param UserEntity
     * @return
     */
    @PostMapping("/save")
    public AjaxResult saveUser(@RequestBody UserEntity UserEntity){
        UserService.save(UserEntity);
        return AjaxResult.success("新增保养员信息成功");
    }

    /**
     * 批量删除汽车信息
     * @param UserIds
     * @return
     */
    @PostMapping("/delete")
    public AjaxResult deleteUser(@RequestBody List<Long> UserIds){
        UserService.removeByIds(UserIds);
        return AjaxResult.success("删除保养员信息成功");
    }

    /**
     * 修改汽车信息
     * @param UserEntity
     * @return
     */
    @PostMapping("/update")
    public AjaxResult updateUser(@RequestBody UserEntity UserEntity){
        UserService.updateById(UserEntity);
        return AjaxResult.success("修改保养员信息成功");
    }

    /**
     * 查询汽车成功
     * @param UserEntity
     * @return
     */
    @PostMapping("/select")
    public AjaxResult selectUser(@RequestBody UserEntity UserEntity){
        return AjaxResult.success(UserService.getAll(UserEntity));
    }
}
=======
package com.example.demo.controller;


import com.example.demo.entity.UserEntity;
import com.example.demo.server.UserService;
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
@RequestMapping("/user-entity")
public class UserController {
    @Autowired
    private UserService UserService;
    /**
     * 新增汽车信息
     * @param UserEntity
     * @return
     */
    @PostMapping("/save")
    public AjaxResult saveUser(@RequestBody UserEntity UserEntity){
        UserService.save(UserEntity);
        return AjaxResult.success("新增汽车信息成功");
    }

    /**
     * 批量删除汽车信息
     * @param UserIds
     * @return
     */
    @PostMapping("/delete")
    public AjaxResult deleteUser(@RequestBody List<Integer> UserIds){
        UserService.removeByIds(UserIds);
        return AjaxResult.success("删除汽车信息成功");
    }

    /**
     * 修改汽车信息
     * @param UserEntity
     * @return
     */
    @PostMapping("/update")
    public AjaxResult updateUser(@RequestBody UserEntity UserEntity){
        UserService.updateById(UserEntity);
        return AjaxResult.success("修改汽车信息成功");
    }

    /**
     * 查询汽车成功
     * @param UserEntity
     * @return
     */
    @PostMapping("/select")
    public AjaxResult selectUser(@RequestBody UserEntity UserEntity){
        List<UserEntity> list = UserService.getAll(UserEntity);
        return AjaxResult.success("修改汽车信息成功");
    }
}
>>>>>>> 4d743afdae11cf4a101037e57113edd76d3f7080
