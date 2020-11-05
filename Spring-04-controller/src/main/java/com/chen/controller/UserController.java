package com.chen.controller;


import com.chen.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    //localhost:8080/user/t1?name=xxx;
    @GetMapping("/t1")
    public String test1(@RequestParam("name") String name, Model model){
        //1.接受前端参数
        System.out.println(name);
        //2.将返回的结果传递给前端
        model.addAttribute("msg",name);
        //3.跳转视图
        return "test";
    }

    //前端提交一个对象 ： id  name age
    /*
    1、接受前端传递的参数，判断参数的名字，若名字直接在方法上，可以使用
    2、若传递的是一个对象，则会匹配对象的字段名，一致则赋值成功，反之失败

     */
    @GetMapping("/t2")
    public String test2(User user){
        System.out.println(user.toString());
        return "test";
    }

    @GetMapping("/t3")
    public String test3(Model model){

        return "test";
    }

}
