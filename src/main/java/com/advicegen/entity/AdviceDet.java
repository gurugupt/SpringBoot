package com.advicegen.entity;

import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Data

@NoArgsConstructor
@Builder
@AllArgsConstructor

public class AdviceDet {

    private String adviceType;
    private Date orginalAdvDat;
    private String bizGrp;
    private String advKey;
    private  int autoNumber;
    private String regenStatus;
    private String accntNumber;
    private Timestamp timestamp;

}
