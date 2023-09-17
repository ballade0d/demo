package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    //  具体的sql文件在该mapper的同名文件中
    String getPasswordByUsername(@Param("username") String username);

    void register(@Param("username") String username, @Param("password") String password);
}
