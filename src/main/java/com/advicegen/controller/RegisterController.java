package com.advicegen.controller;

import com.advicegen.entity.Register;
import com.advicegen.entity.RegistrationVO;
import com.advicegen.payload.RegisterDto;
import com.advicegen.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @Autowired
    RegisterService registerService;
    @PostMapping(value = {"/register", "/signup"})
    public ResponseEntity<String> insertAdvice(@RequestBody RegisterDto registerDto) {


        String response = registerService.saveAdvice(registerDto);

            System.out.println(response);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        }
    }


