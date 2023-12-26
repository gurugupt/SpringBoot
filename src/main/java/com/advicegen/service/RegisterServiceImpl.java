package com.advicegen.service;

import com.advicegen.entity.Register;
import com.advicegen.entity.RegistrationVO;
import com.advicegen.entity.VerifyVo;
import com.advicegen.exception.AlreadyExist;
import com.advicegen.exception.DuplicateEntryException;
import com.advicegen.mapper.SaveRegistration;
import com.advicegen.payload.RegisterDto;
import org.apache.ibatis.jdbc.SQL;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.Random;

@Service
public class RegisterServiceImpl implements RegisterService  {

    @Autowired
    SaveRegistration saveRegistration;

    @Override
    public String saveAdvice(RegisterDto registerDto) {

        Register register = new Register();
        RegistrationVO registrationVO = new RegistrationVO();
        VerifyVo verifyVo = new VerifyVo();

        registrationVO.setAdviceType(registerDto.getAdviceType());

        registrationVO.setBizGrp(registerDto.getBizGrp());

        registrationVO.setAdvKey(registerDto.getAdvKey());

        registrationVO.setAutoNumber(registerDto.getAutoNumber());

        registrationVO.setRegenStatus(registerDto.getRegenStatus());

        registrationVO.setAccntNumber(registerDto.getAccntNumber());

        Date dat = new Date();

        java.sql.Date sqlDat = new java.sql.Date(dat.getTime());

        registrationVO.setOrginalAdvDat(sqlDat);

        Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());

        Instant instant = Instant.now();
        Timestamp timestamp = Timestamp.from(instant);
//
        registrationVO.setTimestamp(timestamp);

        register.setAccntNumber(registerDto.getAccntNumber());
        String accntNumber = registerDto.getAccntNumber();

        String register1 = saveRegistration.findbyAccnt(accntNumber);

        int res;

        if (register1 != null) {
            throw new AlreadyExist("the account number is already existing ");
        } else
             res = saveRegistration.saveRegister(registrationVO);

            if (res>0)
            {
                Random rand = new Random();
                int t = rand.nextInt(9999);

                verifyVo.setAccntNbr(accntNumber);
                verifyVo.setOtp(t);
                verifyVo.setStatus("NO");

                int ver = saveRegistration.saveOtp(verifyVo);

                if(ver>=0) {

                    return "The account is entered in the system bt yet to be verfied";

                }
                else
                    return "there is problem in creating an account";
            }
            else
                return "there is problem in creating account ";



    }
 }


