package com.advicegen.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Register {


    private String adviceType;
    private Date orginalAdvDat;
    private String bizGrp;
    private String advKey;
    private  int autoNumber;
    private String regenStatus;
    private String accntNumber;
    private Timestamp timestamp;

}
