package com.example.ssmstudy;

import com.example.ssmstudy.service.impl.BookServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class SsmStudyApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SsmStudyApplication.class, args);
        BookServiceImpl bookService = new BookServiceImpl();
    }

}
