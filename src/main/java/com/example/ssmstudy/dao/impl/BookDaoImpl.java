package com.example.ssmstudy.dao.impl;

import com.example.ssmstudy.dao.BookDao;
import jakarta.annotation.PreDestroy;

import java.awt.print.Book;

public class BookDaoImpl implements BookDao {

    //如果实现则代表 有实例化
    public BookDaoImpl( ) {
        System.out.println("BookDaoImpl is running");
    }

    public void save() {
        System.out.println("book dao save....");
    }


    //表示bean初始化对应的操作
    public void init(){
        System.out.println("init....");
    }

    //表示Bean销毁前对应的操作
    public void destroy(){
        System.out.println("destroy...");
    }
}
