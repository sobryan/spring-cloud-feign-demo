package com.example.secondservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient("eurekafeign-firstservice")
public interface GreetingClient {
    @GetMapping(value = "/greeting",produces = "application/json",consumes = "application/json")
    Greeting create(@RequestParam("name") String name);
}
