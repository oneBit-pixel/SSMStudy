package com.example.ssmstudy.service.impl;

import com.example.ssmstudy.dao.BookDao;
import com.example.ssmstudy.dao.UserDao;
import com.example.ssmstudy.dao.impl.BookDaoImpl;
import com.example.ssmstudy.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    @Qualifier("bookDao2")
    private BookDao bookDao;

    public void save() {
        System.out.println("book service save");
        bookDao.save();
    }

}
