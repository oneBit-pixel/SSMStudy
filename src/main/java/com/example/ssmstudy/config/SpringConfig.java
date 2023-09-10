package com.example.ssmstudy.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
//扫描同一个包下的类
//@ComponentScan("com.example.ssmstudy.config")
@ComponentScan("com.example")
@PropertySource("jdbc.properties")
//告诉程序有用aop
@EnableAspectJAutoProxy
public class SpringConfig {


}
