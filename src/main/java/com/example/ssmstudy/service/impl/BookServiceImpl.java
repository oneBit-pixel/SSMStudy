package com.example.ssmstudy.service.impl;

import com.example.ssmstudy.dao.BookDao;
import com.example.ssmstudy.dao.UserDao;
import com.example.ssmstudy.dao.impl.BookDaoImpl;
import com.example.ssmstudy.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    //5.删除业务层中使用new的方式创建的dao对象
    private BookDao bookDao;

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    public void save() {
        System.out.println("book service save");
        bookDao.save();
        userDao.save();
    }


    //6. 提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        System.out.println("set...");
        this.bookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }
}
