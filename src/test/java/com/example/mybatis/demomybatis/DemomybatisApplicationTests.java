package com.example.mybatis.demomybatis;

import com.example.mybatis.demomybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest

public class DemomybatisApplicationTests {

    @Resource
    private UserService userService;
    @Test
    public void contextLoads() {
        userService.insertAllDemo();
    }

}

