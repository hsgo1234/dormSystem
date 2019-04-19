package com.qddx.dao;

import com.qddx.domain.Access;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AccessMapper {

    /**
    * 查找所有门禁记录
    *
    * @params
    * @return list<Access>
    */
    @Select("select * from access")
    List<Access> selectAll();

    /**
    * 根据学生id查询
    *
    * @params stuid
    * @return Access
    */
    @Select("select * from access where stuid = #{stuid}")
    Access selectByStuId(@Param("stuid") Integer stuid);

    /**
    * 根据公寓id查询
    *
    * @params dormid
    * @return Access
    */
    @Select("select * from access where dormid = #{dormid}")
    Access selectByDormId(@Param("dorm") Integer dormid);

    /**
    * 插入一条门禁记录
    *
    * @params
    * @return
    */
    @Insert("insert into access (stuid,acctype,accdate,dormid,roomid) " +
            "value (#{stuid},#{acctype},#{accdate},#{dormid},#{roomid})")
    void insert(Access access);
}