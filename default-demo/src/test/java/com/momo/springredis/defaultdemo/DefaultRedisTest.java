package com.momo.springredis.defaultdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DefaultRedisTest {

//	@Autowired
//	private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testOpsForValueSet() {
        stringRedisTemplate.opsForValue().set("default-name", "小明");
    }

    @Test
    public void testOpsForValueGet() {
        String name = stringRedisTemplate.opsForValue().get("default-name");
        System.out.println(name);

    }

}
