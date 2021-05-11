package com.spring.service;

import com.spring.bean.UserTestBean;

import java.util.List;

/** @Author: QTX @Date: 2021/5/11 */
public interface UserTestService {
  /**
   * 根据名字查询
   *
   * @param name
   * @return
   */
  List<UserTestBean> queryByName(String name);

  /**
   * 根据模糊名字查询
   *
   * @param name
   * @return
   */
  List<UserTestBean> queryLikeName(String name);
}
