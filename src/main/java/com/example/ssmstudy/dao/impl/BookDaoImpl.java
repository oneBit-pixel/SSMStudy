package com.example.ssmstudy.dao.impl;

import com.example.ssmstudy.dao.BookDao;
import jakarta.annotation.PreDestroy;

import java.awt.print.Book;

public class BookDaoImpl implements BookDao {


    private int connectNum;
    private String databaseName;


    public BookDaoImpl(int connectNum, String databaseName) {
        this.connectNum = connectNum;
        this.databaseName = databaseName;
    }

    //如果实现则代表 有实例化
    public BookDaoImpl() {
        System.out.println("BookDaoImpl is running");
    }

    public void save() {
        System.out.println("book dao save...." + databaseName + "," + connectNum);
    }


}
