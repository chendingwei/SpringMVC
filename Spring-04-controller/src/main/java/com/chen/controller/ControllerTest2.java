package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// 被这个注解的类中所有的方法，
// 如果返回值是String，
// 并且有对应的JSP页面可以跳转
// 就会被视图解析器解析
public class ControllerTest2 {
    @RequestMapping("/t2")
    public String test2(Model model){
        model.addAttribute("msg", "ControllerTest2");
        return "test";
    }
}

