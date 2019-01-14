package com.example.mybatis.demomybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mybatis.demomybatis.dao")
public class DemomybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemomybatisApplication.class, args);
    }

}

