package com.spring.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * @Configuration 这是配置类 @EnableAspectJAutoProxy 启用aop注解开发 @ComponentScan("com.spring")
 * 启用组件扫描，括号内为要扫描的包 @MapperScan("com.spring.mapper")
 * 启用mybatis的mapper接口扫描，括号内同上 @Import(MybatisConfig.class) 引入其他配置文件 @Author: QTX @Date: 2021/5/10
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.spring")
@MapperScan("com.spring.mapper")
@Import(MybatisConfig.class)
public class SpringConfig {}
