package com.kontrakkan.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ApplicationController {

    @RequestMapping(value = "/")
    public String HelloWorld(){
        return "hello";
    }
}
