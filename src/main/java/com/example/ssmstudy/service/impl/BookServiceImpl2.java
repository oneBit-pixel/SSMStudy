package com.example.ssmstudy.service.impl;

import com.example.ssmstudy.dao.BookDao;
import com.example.ssmstudy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Component
@Service
public class BookServiceImpl2 implements BookService {

    @Autowired
    private BookDao bookDao;

    public void save() {
        System.out.println("book service save");
        bookDao.save();
    }

}
