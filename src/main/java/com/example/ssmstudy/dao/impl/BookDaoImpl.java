package com.example.ssmstudy.dao.impl;

import com.example.ssmstudy.dao.BookDao;
import jakarta.annotation.PreDestroy;

import java.awt.print.Book;
import java.util.*;

public class BookDaoImpl implements BookDao {


    private int connectNum;
    private String databaseName;
    private int[] array;
    private List<String> list;

    private Set<String> set;

    private Map<String, Integer> map;

    private Properties properties;

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setConnectNum(int connectNum) {
        this.connectNum = connectNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public BookDaoImpl(int connectNum, String databaseName) {
        this.connectNum = connectNum;
        this.databaseName = databaseName;
    }

    //如果实现则代表 有实例化
    public BookDaoImpl() {
        System.out.println("BookDaoImpl is running");
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }


    public void save() {
        System.out.printf(toString());
    }


    @Override
    public String toString() {
        return "BookDaoImpl{" +
                "connectNum=" + connectNum +
                ", databaseName='" + databaseName + '\'' +
                ", array=" + Arrays.toString(array) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
