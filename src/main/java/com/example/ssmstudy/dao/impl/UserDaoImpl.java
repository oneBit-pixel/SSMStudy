package com.example.ssmstudy.dao.impl;

import com.example.ssmstudy.dao.BookDao;
import com.example.ssmstudy.dao.UserDao;

public class UserDaoImpl implements UserDao {

    private UserDao userDao;

    private BookDao bookDao;



    @Override
    public void save() {
        System.out.println("UserDao");
    }
}
