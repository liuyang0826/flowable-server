package com.liuyang0826.flowable.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flowable")
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
