package com.qddx.dao;

import com.qddx.domain.BedTime;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BedTimeMapper {
    /**
    * 查询所有归寝记录
    *
    * @params
    * @return
    */
    @Select("select * from bedtime")
    List<BedTime> selectAll();

    /**
    * 根据学生id查询
    *
    * @params stuid
    * @return Bedtime
    */
    @Select("select * from bedtime where stuid = #{stuid}")
    List<BedTime> selectByStuId(@Param("stuid") Integer stuid);

    /**
    * 根据公寓id查询
    *
    * @params
    * @return
    */
    @Select("select * from bedtime where dormid = #{dormid}")
    List<BedTime> selectByDormId(@Param("dormid") Integer dormid);

    /**
    * 根据日期查询
    *
    * @params
    * @return
    */
    @Select("select * from bedtime where beddate like #{beddate}")
    List<BedTime> selectByBedDate(@Param("beddate") String  beddate);

    /**
    * 根据学生id和归寝日期查询
    *
    * @params stuid,bedate
    * @return bedtime
    */
    @Select("selcet * from bedtime where stuid = #{stuid} and beddate like #{beddate}")
    BedTime selectByStuIdAndBedDate(@Param("stuid") Integer stuid,@Param("beddate") String beddate);
}