package com.example.receiver_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PropertySourceResolver {


    @Value("${hello.url}") private String firstProperty;
    @Value("${example.secondProperty}") private String secondProperty;

    public String getFirstProperty() {
        return firstProperty;
    }

    public String getSecondProperty() {
        return secondProperty;
    }

    public String getMessage(String name){
        String message = "Hi "+name+" How may i help you?";
        return message;
    }
}