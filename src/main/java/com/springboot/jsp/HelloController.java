package com.springboot.jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableAutoConfiguration
@RequestMapping("hello")
public class HelloController {
    @RequestMapping("list")
    public String list(){
//        return "demo/list";//访问路径为http://localhost:8080/hello/list是在访问/WEB-INF/view/demo/list.jsp
        return "list";//访问路径为http://localhost:8080/hello/list是在访问/WEB-INF/view/list.jsp
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class,args);
    }
}

