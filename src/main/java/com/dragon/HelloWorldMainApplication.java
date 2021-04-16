package com.dragon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description springboot主程序
 * @Author Dragon
 * @Date 2021/4/17
 * @Version 1.0.0
 */
// 标注一个主程序（说明这是一个SpringBoot的应用）
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        //启动SpringBoot
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
