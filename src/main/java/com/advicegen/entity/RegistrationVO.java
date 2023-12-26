package com.advicegen.entity;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;


@Getter
@Setter
public class RegistrationVO {

    private String adviceType;
    private Date orginalAdvDat;
    private String bizGrp;
    private String advKey;
    private  int autoNumber;
    private String regenStatus;
    private Timestamp timestamp;
    private String accntNumber;


}
