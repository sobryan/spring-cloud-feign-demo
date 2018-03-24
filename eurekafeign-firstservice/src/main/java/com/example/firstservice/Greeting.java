package com.example.firstservice;

import org.springframework.web.bind.annotation.RestController;

public class Greeting {

    public Greeting(){

    }

    public Greeting(String message) {
        this.message = message;
    }

    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
