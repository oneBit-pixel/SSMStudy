package com.example.ssmstudy.dao.impl;

import com.example.ssmstudy.dao.BookDao;

import java.awt.print.Book;

public class BookDaoImpl implements BookDao {

    //如果实现则代表 有实例化
    public BookDaoImpl( ) {
        System.out.println("BookDaoImpl is running");
    }

    public void save() {
        System.out.println("book dao save....");
    }

}
