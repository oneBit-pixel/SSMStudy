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

        BookService bookService = (BookService) ctx.getBean("service4");
        BookService bookService1 = (BookService) ctx.getBean("service4");
        bookService.save();

        System.out.println(bookService);
        System.out.println(bookService1);
    }
}
