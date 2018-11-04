package com.momo.springbootredis.customdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomRedisTest {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;


    @Test
    public void testOpsForValueSet() {
        redisTemplate.opsForValue().set("name", "小明");
    }

    @Test
    public void testOpsForValueGet() {
        String value = (String) redisTemplate.opsForValue().get("name");
        System.out.println(value);
    }

}
