package com.example;

import com.example.ssmstudy.dao.BookDao;
import com.example.ssmstudy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        //3.获取IoC 容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //4.获取bean
        BookService bookservice = (BookService) ctx.getBean("bookService");

        bookservice.save();



        ctx.registerShutdownHook();
    }
}
