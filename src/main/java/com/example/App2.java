package com.example;

import com.example.ssmstudy.dao.BookDao;
import com.example.ssmstudy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml.bak");

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");

        BookService bookService = ctx.getBean(BookService.class);
        System.out.println(bookService);
    }
}
