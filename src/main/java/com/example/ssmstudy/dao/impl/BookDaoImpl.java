package com.example.ssmstudy.dao.impl;

import com.example.ssmstudy.dao.BookDao;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.*;

//@Component("bookDao") //配置了一个bean
@Repository("bookDao")
@ComponentScan("com.example")
@Scope("singleton")
public class BookDaoImpl implements BookDao {


    //简单类型注入
    @Value("${name}")
    private String name;

    public void save() {
        long endTime = System.currentTimeMillis();
        System.out.println("执行万次消耗时间:" + endTime + "ms");
    }


    @PostConstruct
    public void init() {
        System.out.println("init....");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy...");
    }

    public void update() {
        System.out.println("book dao update...");
    }

    public void delete() {
        System.out.println("book dao delete...");
    }

    public void select() {
        System.out.println("book dao select...");
    }
}
