package com.qddx.dao;

import com.qddx.domain.Dormitory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DormitoryMapper {
    /**
    * 根据公寓id查询
    *
    * @params
    * @return
    */
    @Select("select * from dormitory where dormid = #{dormid}")
    Dormitory selectByDormId(@Param("dormid") Integer dormid);

    /**
    * 查找所有
    *
    * @params
    * @return
    */
    @Select("select * from dormitory")
    List<Dormitory> selectAll();

    /**
    * 根据公寓名字查询
    *
    * @params
    * @return
    */
    @Select("select * from dormitory where dormname = #{dormname}")
    List<Dormitory> selectByDormName(@Param("dormname") String dormname);

    /**
    * 根据公寓名称和楼号查询
    *
    * @params
    * @return
    */
    @Select("select * from dormitory where dormname = #{dormname} and dormno = #{dormno}")
    List<Dormitory> selectByDormNameAndDormNo(@Param("dormname") String dormname,@Param("dormno") String dormno);
}