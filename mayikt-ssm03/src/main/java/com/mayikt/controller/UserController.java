package com.mayikt.controller;

import com.mayikt.entity.UserEntity;
import com.mayikt.mapper.UserMapper;
import com.mayikt.service.UserService;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /*
           查找
     */

    @GetMapping("/getById/{id}")
    public UserEntity getById(@PathVariable("id")Integer id){
        return userService.getById(id);
    }

    /*
            增添
     */

    @PostMapping("/insertUser")
    public String insertUser(@RequestBody UserEntity userEntity){
        return userService.insertUser(userEntity)>0 ? "插入数据成功！":"插入数据失败！";
    }

    /*
            修改
     */

    @PutMapping("/updateUser")
    public int updateUser(@RequestBody UserEntity userEntity){
        return userService.updateUser(userEntity);
    }

    /*
            删除
     */

    @DeleteMapping("/deleteUser/{id}")
    public int deleteUser(@PathVariable("id")Integer id){
        return userService.deleteById(id);
    }

}
