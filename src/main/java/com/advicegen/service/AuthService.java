package com.advicegen.service;


import com.advicegen.payload.LoginDto;
import org.springframework.stereotype.Service;

import java.io.NotActiveException;


public interface AuthService {

    public boolean logincheck(LoginDto loginDto) throws NotActiveException;

}
