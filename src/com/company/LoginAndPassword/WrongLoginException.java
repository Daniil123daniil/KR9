package com.company.LoginAndPassword;

public class WrongLoginException extends Exception{

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
