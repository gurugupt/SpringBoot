package com.advicegen.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VerifyVo {
    private String accntNbr;
    private int otp;
    private String status;

}
