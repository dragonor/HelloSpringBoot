package com.dragon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author Dragon
 * @Date 2021/4/17
 * @Version 1.0.0
 */
//@ResponseBody  //这个类的所有方法返回的数据直接写给浏览器（如果是对象，可以直接转成json数据）
//@Controller
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot quick build!";
    }
}
