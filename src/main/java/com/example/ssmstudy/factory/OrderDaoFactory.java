package com.example.ssmstudy.factory;

import com.example.ssmstudy.dao.BookDao;
import com.example.ssmstudy.dao.impl.BookDaoImpl;
import com.example.ssmstudy.service.impl.BookServiceImpl;

public class OrderDaoFactory {
    public static BookDao getOrderDao() {
        System.out.println("factory....");
        return new BookDaoImpl();
    }
}
