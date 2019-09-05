package com.cjj.stuspringbootdemo.controller;

import com.cjj.stuspringbootdemo.config.jedis.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {
    @RequestMapping("/test")
    public Object test(){
        return "hello world!";
    }

  /*  @RequestMapping(value="/resttest",method= RequestMethod.GET)
    public Object resttest(HttpServletResponse rest){
        return "rest hello world!";
    }*/

    @RequestMapping(value="/resttest/{rest}")
    public Object resttest(@PathVariable("rest") String a){
        return "rest hello world!"+a;
    }

    @Autowired
    private JedisUtil jedis;
    @RequestMapping("/restJedis/{val}")
    public Object restJedis(@PathVariable String val){
        jedis.set("key-"+val,val);
        return "result-OK";
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @GetMapping("/list")
    public List<Map<String, Object>> queryUsers(){
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from user");
        return list;
    }
}

