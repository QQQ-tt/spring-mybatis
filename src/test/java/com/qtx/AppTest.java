package com.qtx;

import com.spring.bean.UserBean;
import com.spring.bean.UserTestBean;
import com.spring.config.SpringConfig;
import com.spring.service.UserService;
import com.spring.service.UserTestService;
import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

/** @Author: QTX @Date: 2021/5/10 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AppTest {
  @Autowired private DataSource dataSource;

  @SneakyThrows
  @Test
  public void testDataSource() {
    Connection connection = dataSource.getConnection();
    System.out.println(connection);
  }

  @Autowired private UserService userService;

  @Test
  public void test() {
    List<UserBean> userBeans = userService.queryAll();
    for (UserBean userBean : userBeans) {
      System.out.println(userBean);
    }
  }

  @Test
  public void test1() {
    List<UserBean> userBeans = userService.queryMany("q");
    for (UserBean userBean : userBeans) {
      System.out.println(userBean);
    }
  }

  @Autowired private UserTestService userTestService;

  @Test
  public void test2() {
    List<UserTestBean> userTestBeans = userTestService.queryByName("123");
    for (UserTestBean userTestBean : userTestBeans) {
      System.out.println(userTestBean);
    }
  }

  @Test
  public void test3() {
    List<UserTestBean> likeName = userTestService.queryLikeName("q");
    for (UserTestBean userTestBean : likeName) {
      System.out.println(userTestBean);
    }
  }
}
