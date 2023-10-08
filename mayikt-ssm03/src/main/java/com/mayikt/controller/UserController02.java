package com.mayikt.controller;

import com.mayikt.entity.UserEntity;
import com.mayikt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user02")
public class UserController02 extends BaseController{
    @Autowired
    private UserService userService;



    /*
           查找
     */

    @GetMapping("/getById/{id}")
    public Map<String,Object> getById(@PathVariable("id")Integer id){
        if (id==null){
            return setResultError("id is null");
        }
        UserEntity user = userService.getById(id);
        if (user==null){
            return setResultError("根据id没有找到user信息");
        }
        return setResultOk(user);
    }

    /*
            增添
     */

    @PostMapping("/insertUser")
    public Map<String,Object> insertUser(@RequestBody UserEntity userEntity){
        return userService.insertUser(userEntity)>0 ? setResultSuccess("插入数据成功！")
                :setResultError("插入数据失败！");
    }

    /*
            修改
     */

    @PutMapping("/updateUser")
    public Map<String,Object> updateUser(@RequestBody UserEntity userEntity){
        return userService.updateUser(userEntity)>0 ? setResultSuccess("更新数据成功！")
                : setResultError("数据更新失败！");
    }

    /*
            删除
     */

    @DeleteMapping("/deleteUser/{id}")
    public Map<String,Object> deleteUser(@PathVariable("id")Integer id){
        if (id==null){
            return setResultError("id is null");
        }
        return userService.deleteById(id)>0 ? setResultSuccess("删除数据成功！")
                : setResultError("删除数据失败！");
    }

    /*
            查询所有！
     */
    @GetMapping("/getUsersAll")
    public Map<String,Object> getUsersAll(){
        List<UserEntity> userEntities = userService.getUsersAll();
        return  setResultOk(userEntities) ;
    }
}
