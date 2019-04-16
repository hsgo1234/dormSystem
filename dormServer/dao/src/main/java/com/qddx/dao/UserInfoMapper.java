package com.qddx.dao;

import com.qddx.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description:
 * @Author: HUOHENGTONG
 * @CreateDate: 2019/4/16 14:21
 */
@Mapper
public interface UserInfoMapper {
    @Select("select * from userinfo")
    List<UserInfo> selectAll();

    @Select("select * from userinfo where username = #{username}")
    UserInfo findByUsername(@Param("username") String username);
}
