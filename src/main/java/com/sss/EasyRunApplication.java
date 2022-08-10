package com.sss;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan(value= {"com.sss.mapper", "com.sss.ormbase.autogenerator.common.mapper"})
@SpringBootApplication
public class EasyRunApplication {
    public static void main(String[] args) {
        SpringApplication.run(EasyRunApplication.class, args);
    }
}
