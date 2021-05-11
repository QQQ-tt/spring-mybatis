package com.spring.bean;

import lombok.Data;

/** 测试数据库列名和实体类不统一的情况 @Author: QTX @Date: 2021/5/11 */
@Data
public class UserTestBean {
  private int sid;
  private String sname;
  private String spsd;
}
