package com.spring.service.Impl;

import com.spring.bean.UserTestBean;
import com.spring.mapper.UserTestMapper;
import com.spring.service.UserTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/** @Author: QTX @Date: 2021/5/11 */
@Service("userTestService")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserTestServiceImpl implements UserTestService {
  private final UserTestMapper userTestMapper;

  @Override
  public List<UserTestBean> queryByName(String name) {
    return userTestMapper.selectByName(name);
  }

  @Override
  public List<UserTestBean> queryLikeName(String name) {
    return userTestMapper.selectLikeName(name);
  }
}
