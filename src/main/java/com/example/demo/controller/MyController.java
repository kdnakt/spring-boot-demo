package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class MyController {

    @RequestMapping(value="/fuga", method=RequestMethod.GET)
    public String requestMethodName(HttpSession session) {
        session.setAttribute("creationtime", session.getCreationTime());
        return "hoge";
    }
    
    @RequestMapping(value="/time", method=RequestMethod.GET)
    public String get(HttpSession s) {
        return (String) s.getAttribute("creationtime");
    }
}