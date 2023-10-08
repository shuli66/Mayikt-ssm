package com.mayikt.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration

@ComponentScan({"com.mayikt.service"})

//开启事务
@EnableTransactionManagement

@Import({MybatisConfig.class, JdbcConfig.class})
@MapperScan("com.mayikt.mapper")

public class SpringConfig {
}
