package com.spring.mapper;

import com.spring.bean.UserTestBean;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/** 测试数据库列名和实体类不统一的情况 @Author: QTX @Date: 2021/5/11 */
public interface UserTestMapper {

  /**
   * 根据名字查询
   *
   * @param name
   * @return
   */
  @Select("select * from test where name = #{name}")
  @Results(
      id = "user",
      value = {
        @Result(property = "sid", column = "id"),
        @Result(property = "sname", column = "name"),
        @Result(property = "spsd", column = "password")
      })
  List<UserTestBean> selectByName(String name);

  /**
   * 模糊查询
   *
   * @param name
   * @return
   */
  @Select("select * from test where name like '%${value}%'")
  @ResultMap("user")
  List<UserTestBean> selectLikeName(String name);
}
