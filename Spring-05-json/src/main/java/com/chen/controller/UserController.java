package com.chen.controller;


import com.alibaba.fastjson.JSON;
import com.chen.pojo.User;
import com.chen.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


//@Controller
//走视图解析器
@RestController
//所有方法只返回字符串
public class UserController {
    @ResponseBody
    //不走视图解析器，直接返回字符串
    //配合Controller使用
    @RequestMapping(value = "/j1")
    public String json1() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("陈", 25, "男");
        String s = mapper.writeValueAsString(user);
        return s;
    }

    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        ArrayList<User> usersList = new ArrayList<>();
        User user1= new User("陈1",24,"male");
        User user2= new User("陈2",24,"male");
        User user3= new User("陈3",24,"male");
        User user4= new User("陈4",24,"male");
        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);
        usersList.add(user4);

        String s = mapper.writeValueAsString(usersList);
        return s;
    }
    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {
        Date date = new Date();
        return JsonUtils.getJson(date,"yyyy-MM-dd HH-mm-ss");
    }
    @RequestMapping("/j4")
    public String json4(){
        ArrayList<User> usersList = new ArrayList<>();
        User user1= new User("陈1",24,"male");
        User user2= new User("陈2",24,"male");
        User user3= new User("陈3",24,"male");
        User user4= new User("陈4",24,"male");
        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);
        usersList.add(user4);
        return JSON.toJSONString(usersList);
    }
}
