package com.dev.springboot.bootcamp01.week2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController2 {

    @Autowired
    private FnEditor fnEditor;

    @InitBinder
    protected void initBinder(DataBinder dataBinder){
        dataBinder.registerCustomEditor(String.class, "fn", fnEditor);
    }

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
    @GetMapping("/fetch2")
    @ResponseBody
    public String getuser(@RequestParam String fn,
                          @RequestParam String ln,
                          @RequestParam int age){
        return "fetching firstName "+ fn +" lastname "+ ln+" age: "+age;
    }

    @GetMapping("/fetch3/{id}")
    @ResponseBody
    public String fetchId(@PathVariable String id){
        return "fetched id is : "+ id;
    }


}
