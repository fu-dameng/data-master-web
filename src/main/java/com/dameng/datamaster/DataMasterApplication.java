package com.dameng.datamaster;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.dameng.datamaster.mapper"})
public class DataMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataMasterApplication.class, args);
    }

}
