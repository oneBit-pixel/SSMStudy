package com.example.ssmstudy.factory;

import com.example.ssmstudy.dao.BookDao;
import com.example.ssmstudy.dao.impl.BookDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<BookDao> {
    //代替原始实例工厂中创建对象
    @Override
    public BookDao getObject() throws Exception {
        return new BookDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return BookDao.class;
    }


    //是否为单例
    @Override
    public boolean isSingleton() {
        return false;
    }
}
