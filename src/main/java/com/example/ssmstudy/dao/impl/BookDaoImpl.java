package com.example.ssmstudy.dao.impl;

import com.example.ssmstudy.dao.BookDao;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.*;
//@Component("bookDao") //配置了一个bean
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.printf(toString());
    }

}
