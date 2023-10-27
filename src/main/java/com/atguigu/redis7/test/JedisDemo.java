package com.atguigu.redis7.test;

import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;

@Log4j
public class JedisDemo {

    private static Logger logger = LoggerFactory.getLogger(JedisDemo.class);

    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.138.133", 6379);
        jedis.auth("111111");
        System.out.println(jedis.ping());
        jedis.set("k1","j1");
        System.out.println(jedis.get("k1"));
    }
}
