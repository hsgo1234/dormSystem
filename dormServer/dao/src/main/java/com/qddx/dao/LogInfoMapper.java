package com.qddx.dao;

import com.qddx.domain.LogInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LogInfoMapper {

    /**
    * 根据admin的username查询
    * 
    * @params 
    * @return 
    */
    @Select("select * from loginfo where username = #{username} and usertype = 'admin'")
    LogInfo selcetByUserNameWithAdmin(@Param("username") String username);
    
    /**
    * 根据用户id和用户类型查询
    * 
    * @params 
    * @return 
    */
    @Select("select * from loginfo where usertype = #{usertype} and userid = #{userid}")
    LogInfo selceByUserTypeAndUserId(@Param("usertype") String usertype,@Param("userid") Integer userid);
}