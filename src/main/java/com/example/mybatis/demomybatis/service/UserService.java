package com.example.mybatis.demomybatis.service;

import com.example.mybatis.demomybatis.dao.UserDao;
import com.example.mybatis.demomybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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
@Service
public class UserService {

    @Resource
    private UserDao dao;

    public void insertAllDemo(){
        List<User> list=new ArrayList<>();
        for(int i=0;i<3;i++){
            User user=new User();
            user.setName("tom"+i);
            list.add(user);
        }

        dao.insertAll(list);
    }
}
