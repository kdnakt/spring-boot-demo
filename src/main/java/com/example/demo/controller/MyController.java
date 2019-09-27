package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class MyController {

    @RequestMapping(value="/fuga", method=RequestMethod.GET)
    public String requestMethodName() {
        return "hoge";
    }
    
}