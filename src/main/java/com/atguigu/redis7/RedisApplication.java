package com.atguigu.redis7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RedisApplication {
    @GetMapping("/hello")
    private String hello(@RequestParam String name){
        return "hello" + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }
}
