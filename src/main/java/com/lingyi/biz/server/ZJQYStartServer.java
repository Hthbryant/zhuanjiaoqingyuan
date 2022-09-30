package com.lingyi.biz.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 咕噜科
 * ClassName: ZJQYStartServer
 * date: 2022-10-01 1:04
 * Description:
 * version 1.0
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "com.lingyi")
@MapperScan(basePackages = "com.lingyi.biz.integration.dao")
public class ZJQYStartServer {

    public static void main(String[] args) {
        SpringApplication.run(ZJQYStartServer.class,args);
        System.out.println("==Server start now==");
    }

}
