package com.advicegen.service;

import com.advicegen.entity.Register;
import com.advicegen.entity.RegistrationVO;
import com.advicegen.payload.RegisterDto;
import org.springframework.http.ResponseEntity;

public interface RegisterService {

    public String saveAdvice(RegisterDto registerDto);

}
