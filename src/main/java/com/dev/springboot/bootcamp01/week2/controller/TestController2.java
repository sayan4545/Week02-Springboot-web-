package com.dev.springboot.bootcamp01.week2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController2 {

    @RequestMapping(value = "/fetchUser", method = RequestMethod.GET)
    @ResponseBody
    public String fetchUser(){
        return "fetching user  from get method";
    }

    @RequestMapping(value = "/fetchUserPost",method = RequestMethod.POST)
    @ResponseBody
    public String fetchUserFromPost(){
        return "user from post method";
    }


}
