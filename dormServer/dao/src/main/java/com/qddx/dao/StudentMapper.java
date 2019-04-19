package com.qddx.dao;

import com.qddx.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    /**
    * 根据学生id查找
    * 
    * @params stuid
    * @return student
    */
    @Select("select * from student where stuid = #{stuid}")
    Student selectByStuId(Integer stuid);
    
    /**
    * 根据学生姓名查找
    * 
    * @params 
    * @return 
    */
    @Select("select * from student where stuname = #{stuname}")
    List<Student> selectByStuName(@Param("stuname") String stuname);
    
    /**
    * 根据房间id查询
    * 
    * @params 
    * @return 
    */
    @Select("select * from student where roomid = #{roomid}")
    List<Student> selectByRoomId(Integer roomid);

    /**
    * 根据入学年份查询
    * 
    * @params 
    * @return 
    */
    @Select("select * from student where stueyear = #{stueyear}")
    List<Student> selectByStuEYear(Integer stueyear);
     
    /**
    * 根据公寓id查询
    * 
    * @params 
    * @return 
    */
    @Select("select * from student where dormid = #{dormid}")
    List<Student> selectByDormId(Integer dormid);
}