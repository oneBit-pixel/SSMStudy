package com.example.ssmstudy.dao.impl;

import com.example.ssmstudy.dao.BookDao;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

//@Component("bookDao") //配置了一个bean
@Repository("bookDao2")
@Scope("singleton")
public class BookDaoImpl2 implements BookDao {
    public void save() {
        System.out.printf(toString());
    }


    @PostConstruct
    public void init(){
        System.out.println("init....");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy...");
    }
}
