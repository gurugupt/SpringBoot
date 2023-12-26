package com.advicegen.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterDto {

    private String adviceType;
    private String bizGrp;
    private String advKey;
    private  int autoNumber;
    private String regenStatus;
    private String accntNumber;



}
