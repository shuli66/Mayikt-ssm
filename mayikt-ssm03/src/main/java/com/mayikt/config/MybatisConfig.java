package com.mayikt.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {
    /**
     * mybatis相关配置
     *
     * @param dataSource
     * @return
     */
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(@Autowired DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean =
                new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        // 实体层包
        sqlSessionFactoryBean.setTypeAliasesPackage("com.mayikt.entity");
        return sqlSessionFactoryBean;
    }

}
