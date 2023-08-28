package com.example.ssmstudy.dao.impl;

import com.example.ssmstudy.dao.BookDao;

import java.awt.print.Book;

public class BookDaoImpl implements BookDao {

    public BookDaoImpl() {
        System.out.println("BookDaoImpl is running");
    }

    public void save() {
        System.out.println("book dao save....");
    }

}
