package com.spring.mapper;

import com.spring.bean.UserBean;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/** @Author: QTX @Date: 2021/5/10 */
public interface UserMapper {
  /**
   * 查询所有
   *
   * @return
   */
  @Select("select * from test")
  List<UserBean> selectAll();

  /**
   * 根据名字模糊查询
   *
   * @param name 模糊名字
   * @return 结果
   */
  @Select("select * from test where name like '%${value}%'")
  List<UserBean> selectMany(String name);
}
