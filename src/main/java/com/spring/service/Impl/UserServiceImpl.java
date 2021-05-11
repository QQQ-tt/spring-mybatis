package com.spring.service.Impl;

import com.spring.bean.UserBean;
import com.spring.mapper.UserMapper;
import com.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/** @Author: QTX @Date: 2021/5/10 */
@Service("userService")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService {

  private final UserMapper userMapper;

  @Override
  public List<UserBean> queryAll() {
    return this.userMapper.selectAll();
  }

  @Override
  public List<UserBean> queryMany(String name) {
    return this.userMapper.selectLikeName(name);
  }
}
