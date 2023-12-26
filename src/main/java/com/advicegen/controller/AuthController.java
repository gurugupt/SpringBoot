package com.advicegen.controller;


import com.advicegen.payload.LoginDto;
import com.advicegen.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.NotActiveException;

@RestController

public class AuthController {

    @Autowired
    private AuthService authService;

    @RequestMapping("/login")
    public String getValidate(@RequestBody LoginDto loginDto) throws NotActiveException {


       boolean b = authService.logincheck(loginDto);

       if(!b)
       {
           return "login failed";
       }

       return "login Sucesfull";




    }






}
