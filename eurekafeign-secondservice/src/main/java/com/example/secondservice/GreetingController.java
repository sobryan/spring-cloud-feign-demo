package com.example.secondservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @GetMapping(path = "/greeting",
            produces = { MediaType.APPLICATION_JSON_VALUE })
    public Greeting getGreeting(@RequestParam("name")String name){
        return greetingService.create(name);
    }

    @GetMapping(path = "/queryFirstService",
            produces = { MediaType.APPLICATION_JSON_VALUE } )
    public Greeting queryFirstService(@RequestParam("name")String name){
        return greetingService.queryFirstService(name);
    }


}
