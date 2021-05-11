package com.spring.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/** @Author: QTX @Date: 2021/5/10 */
@Configuration
@ComponentScan("com.spring")
@MapperScan("com.spring.mapper")
@Import(MybatisConfig.class)
public class SpringConfig {}
