package com.example.osahaneat.controller;

import com.example.osahaneat.dto.UserDTO;
import com.example.osahaneat.entity.Users;
import com.example.osahaneat.repository.UserInterface;
import com.example.osahaneat.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginService loginService;
    @PostMapping("/signin")
    public ResponseEntity<?> signin(){

        return new ResponseEntity<>(loginService.getAllUser(), HttpStatus.OK);
    }
}
