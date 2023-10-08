package com.mayikt.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

public class JdbcConfig {
    /**
     * @Bean 相当于 <bean id="dataSource" class="com.alibaba.druid.pool.DruidDataSource"></bean>
     * 配置数据源信息
     * 注入到IOC容器中
     * @return
     */
    @Bean
    public DataSource dataSource(){
        //配置阿里巴巴（alibb）数据源连接池
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/mayikt?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");
        return druidDataSource;
    }

    /**
     * 整合事务
     *
     * @param dataSource
     * @return
     */
    @Bean
    public PlatformTransactionManager platformTransactionManager(@Autowired DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }


}
