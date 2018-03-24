package com.example.firstservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("eurekafeign-secondservice")
public interface GreetingClient {
    @GetMapping(value = "/greeting",produces = { MediaType.APPLICATION_JSON_VALUE } )
    Greeting create(@RequestParam("name") String name);
}
