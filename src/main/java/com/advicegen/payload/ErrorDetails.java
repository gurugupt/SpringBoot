package com.advicegen.payload;

import java.util.Date;

public class ErrorDetails {

    public ErrorDetails(Date timestamp, String message) {
        this.timestamp = timestamp;
        this.message = message;
    }

    private Date timestamp;
    private String message;

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }
}