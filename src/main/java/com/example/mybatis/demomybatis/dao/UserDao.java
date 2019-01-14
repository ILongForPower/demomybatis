package com.example.mybatis.demomybatis.dao;

import com.example.mybatis.demomybatis.entity.User;

import java.util.List;

/**
 * @author
 * @描述:
 * @版权: Copyright (c)
 * @公司:
 * @版本: 1.0
 * @创建日期:
 * @创建时间:
 */
public interface UserDao {
    void insertAll(List<User> list);
}
