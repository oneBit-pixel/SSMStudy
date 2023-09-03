package com.example;

import com.example.ssmstudy.config.SpringConfig;
import com.example.ssmstudy.dao.BookDao;
import com.example.ssmstudy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;


public class AppForAnnotation {
    public static void main(String[] args) {
        //config是不再是从xml中 获取 是从springConfig中获取了
        ApplicationContext ctx =new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");

        BookService bookService = ctx.getBean(BookService.class);
        System.out.println(bookService);
    }
}
