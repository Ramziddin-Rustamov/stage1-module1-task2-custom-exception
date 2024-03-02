package com.epam.mjc;

public class CustomException extends  IllegalArgumentException{
    public CustomException(String s) {
        super(s);
    }
}
