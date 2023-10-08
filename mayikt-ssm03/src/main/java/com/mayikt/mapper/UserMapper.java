package com.mayikt.mapper;

import com.mayikt.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface UserMapper {
    @Insert("insert into mayikt_users(id,name,age,address) values(null,#{name},#{age},#{address})")
    int insertUser(UserEntity userEntity);

    @Delete("delete from mayikt_users where id=#{id}")
    int deleteById(Integer id);

    @Update("UPDATE mayikt_users set  name=#{name}, age=#{age},  address=#{address} WHERE id=#{id};")
    int updateUser(UserEntity userEntity);

    @Select("select * from mayikt_users where id=#{id}")
    UserEntity getById(Integer id);

    @Select("SELECT * FROM mayikt_users")
    List<UserEntity> getUsersAll();

}
