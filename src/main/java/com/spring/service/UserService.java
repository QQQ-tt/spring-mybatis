package com.spring.service;

import com.spring.bean.UserBean;

import java.util.List;

/** @Author: QTX @Date: 2021/5/10 */
public interface UserService {
  /**
   * 查询所有用户
   *
   * @return
   */
  List<UserBean> queryAll();

  /**
   * 根据名字模糊查询
   *
   * @param name
   * @return
   */
  List<UserBean> queryMany(String name);
}
