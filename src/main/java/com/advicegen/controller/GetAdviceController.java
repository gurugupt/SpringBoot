package com.advicegen.controller;

import com.advicegen.entity.AdviceDet;
import com.advicegen.service.GetAdvice;
import lombok.extern.slf4j.Slf4j;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class GetAdviceController {

    @Autowired
    GetAdvice getAdvice;

    @PostMapping("/getAdvice")
    public ResponseEntity<String> getAdviceContro(@RequestBody String accountNumbr)
    {
        System.out.println("I am in Controller class ");
        String adviceDet = getAdvice.getAdviceDet(accountNumbr);
        return new ResponseEntity<>(adviceDet, HttpStatus.FOUND);
    }
}
