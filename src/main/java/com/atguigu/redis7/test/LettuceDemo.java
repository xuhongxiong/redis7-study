package com.atguigu.redis7.test;

import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisURI;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class LettuceDemo {
    public static void main(String[] args) {
        RedisURI uri = RedisURI.builder()
                .redis("192.168.138.133")
                .withPort(6379)
                .withAuthentication("default", "111111")
                .build();
        RedisClient redisClient = RedisClient.create(uri);
        StatefulRedisConnection connect = redisClient.connect();
        RedisCommands<String, String> commands = connect.sync();
        List<String> keys = commands.keys("*");
        for (String key : keys) {
            System.out.println("111111111111---"+key);
        }
        commands.set("k1","l1");
        System.out.println("111111111111---"+commands.get("k1"));

    }
}
