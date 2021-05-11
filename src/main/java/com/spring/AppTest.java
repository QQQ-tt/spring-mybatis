package com.spring;

import com.spring.bean.UserBean;
import com.spring.config.SpringConfig;
import com.spring.service.Impl.UserServiceImpl;
import com.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/** @Author: QTX @Date: 2021/5/10 */
public class AppTest {
  public static void main(String[] args) throws SQLException {
    AnnotationConfigApplicationContext app =
        new AnnotationConfigApplicationContext(SpringConfig.class);
    UserService userService = (UserServiceImpl) app.getBean("userService");
    List<UserBean> userBeans = userService.queryAll();
    for (UserBean userBean : userBeans) {
      System.out.println(userBean);
    }
  }

  public void test() throws SQLException {
    AnnotationConfigApplicationContext app =
        new AnnotationConfigApplicationContext(SpringConfig.class);
    DataSource dataSource = app.getBean(DataSource.class);
    Connection connection = dataSource.getConnection();
    System.out.println(connection);
  }
}
