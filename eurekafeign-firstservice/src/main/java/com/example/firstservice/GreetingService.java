package com.example.firstservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Autowired
    GreetingClient greetingClient;

    String serviceName = "FirstService";

    public Greeting create(String name) {
        return (name == null ? new Greeting(serviceName + " says Hello NoName") : new Greeting(serviceName + "says Hello " + name));
    }

    public Greeting querySecondService(String name) {
        Greeting greeting = greetingClient.create(name);
        return greeting;
    }

}
