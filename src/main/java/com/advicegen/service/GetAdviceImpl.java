package com.advicegen.service;

import com.advicegen.entity.AdviceDet;
import com.advicegen.exception.NotFoundException;
import com.advicegen.mapper.AdviceExtract;
import lombok.extern.slf4j.Slf4j;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GetAdviceImpl implements GetAdvice{


    AdviceDet adviceDet;



    @Autowired
    AdviceExtract adviceExtract;


    @Override
    public String getAdviceDet(String accntNum) {


        String adviceDet = adviceExtract.findbyAccnt(accntNum);

        System.out.println(" i am in service class ");



        if(adviceDet==null)
        {
            throw new NotFoundException("The account number is not registered ");
        }
        else
        return adviceDet;

    }
}
