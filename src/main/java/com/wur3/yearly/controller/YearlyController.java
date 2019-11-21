package com.wur3.yearly.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YearlyController {
    @RequestMapping("/")
    public String hello() {
        return "hello world";
    }
}
