package com.dev.springboot.bootcamp01.week2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    @GetMapping("/get")
    public String getStringResponse(){
        return "Hey rest api!";
    }
}
