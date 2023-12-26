package com.advicegen.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AccesValidate {

    @Select("Select Userid from USER1 where Userid = #{userid} and password=#{password}")
    String findbyLogin(String userid, String password);


}
