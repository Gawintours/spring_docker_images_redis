package com.tool.pro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        redisTemplate.opsForValue().set("特殊字符 8080：","//xAC//xED//x00//x05t//x00//x05mykey");
        return "hello spring boot redis; 8080" + redisTemplate.opsForValue().get("特殊字符：");
    }
}
