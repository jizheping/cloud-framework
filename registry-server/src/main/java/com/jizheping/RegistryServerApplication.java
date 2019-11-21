package com.jizheping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka启动类
 */

//用于开启Eureka服务
@EnableEurekaServer
@SpringBootApplication
public class RegistryServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistryServerApplication.class,args);
    }
}
