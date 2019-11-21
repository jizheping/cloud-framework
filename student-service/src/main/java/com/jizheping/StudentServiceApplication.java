package com.jizheping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 开启student-service服务
 */

//开启Feign
@EnableFeignClients
@SpringBootApplication
@MapperScan(basePackages = "com.jizheping.mapper")
public class StudentServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentServiceApplication.class,args);
    }
}
