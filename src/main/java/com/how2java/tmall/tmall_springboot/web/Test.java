package com.how2java.tmall.tmall_springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @RequestMapping("/test")
    public String test()
    {
        return "nihao";

    }
}
