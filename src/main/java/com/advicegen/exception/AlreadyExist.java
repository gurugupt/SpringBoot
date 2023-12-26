package com.advicegen.exception;

public class AlreadyExist extends RuntimeException {
    public AlreadyExist() {
    }

    public AlreadyExist(String message) {
        super(message);
    }
}
