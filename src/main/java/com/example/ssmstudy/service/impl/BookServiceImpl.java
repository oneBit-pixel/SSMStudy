package com.example.ssmstudy.service.impl;

import com.example.ssmstudy.dao.BookDao;
import com.example.ssmstudy.dao.impl.BookDaoImpl;
import com.example.ssmstudy.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao=new BookDaoImpl();

    public void save(){
        System.out.println("book service save");
        bookDao.save();
    }
}
