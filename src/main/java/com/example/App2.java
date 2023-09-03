package com.example;

import com.example.ssmstudy.dao.BookDao;
import com.example.ssmstudy.dao.impl.BookDaoImpl;
import com.example.ssmstudy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.File;

public class App2 {
    public static void main(String[] args) {
        //1.加载类路径下的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从文件系统下加载配置文件
//        ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\IDEAProject\\SSMDemo\\SSMStudy\\SSMStudy\\src\\main\\resources\\applicationContext.xml");

        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.save();

    }
}
