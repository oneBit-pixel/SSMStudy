package com.example;

import com.example.ssmstudy.dao.BookDao;
import com.example.ssmstudy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        //3.获取IoC 容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //4.获取bean
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//
//        bookDao.save();

        BookDao bookDao = (BookDao) ctx.getBean("userDao");
        BookDao bookDao1 = (BookDao) ctx.getBean("userDao");
        bookDao.save();
        System.out.println(bookDao);
        System.out.println(bookDao1);
    }
}
