package com.lapnguyenit.springbootexample.controller;

import com.lapnguyenit.springbootexample.model.User;
import netscape.javascript.JSObject;
import org.springframework.web.bind.annotation.*;

/*
* định nghĩa url /user*/
@RestController // =@Controller + @ResponseBody
@RequestMapping("/user") //đăng kí đường dẫn

public class UserController {
    public String getUser(){
        return "lapnguyen";
    }
    @RequestMapping("/lapnguyen")
    public String getInfor(){
        return "lap 24 tuoi";
    }
    @RequestMapping("/getUser")
    public String addUser(){
        return "da them";
    }
    @GetMapping("getInfor/{id}") //chỉ có trong spring boot nhận tham số trên url khác với @RequestParam, dựa vào template trong url
    public String getUserInfor(@PathVariable("id") int id){
        return "mã:" +id;
    }
    @GetMapping("getName")
    public String getName (@RequestParam("name") String name){ //nhận tham số trên url giống với jsp/servlet ?name=
        return "tên:" + name;
    }
//    tham số truyền dưới dạng 1 đối tượng json
    @PostMapping("update")
    public String update(@RequestBody User user){
        return "update" + user.getId() + user.getUsername() + user.getPassword();
    }
}
