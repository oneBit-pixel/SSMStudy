package com.example.ssmstudy.factory;

import com.example.ssmstudy.dao.BookDao;
import com.example.ssmstudy.dao.impl.BookDaoImpl;

public class UserDaoFactory {
    //实例工厂初始化
    public BookDao getBookDao() {
        return new BookDaoImpl();
    }
}
