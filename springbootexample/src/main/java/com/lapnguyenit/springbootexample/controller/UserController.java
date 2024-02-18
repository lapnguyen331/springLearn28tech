package com.lapnguyenit.springbootexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* định nghĩa url /user*/
@RestController // =@Controller + @ResponseBody
@RequestMapping("/user") //đăng kí đường dẫn

public class UserController {
    public String getUser(){
        return "lapnguyen";
    }
    @GetMapping("/lapnguyen")
    public String getInfor(){
        return "lap 24 tuoi";
    }
    @GetMapping("/getUser")
    public String addUser(){
        return "da them";
    }
}
