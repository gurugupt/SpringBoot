package com.advicegen.service;

import com.advicegen.entity.Access;
import com.advicegen.exception.NotFoundException;
import com.advicegen.mapper.AccesValidate;
import com.advicegen.payload.LoginDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class AuthServiceImpl  implements AuthService{

    @Autowired
    AccesValidate accesValidate;

    Access access = new Access();
    @Override
    public boolean logincheck(LoginDto loginDto)  {

        String value =
                accesValidate.findbyLogin(loginDto.getUsername(),loginDto.getPassword());

        if (value==null) {

            throw new NotFoundException("You are not authorised");

        }
        return true;

    }
}
