package com.dameng.datamaster.controller;

import com.dameng.datamaster.service.SuperDataService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    SuperDataService superDataService;

    @PostMapping("/echo")
    @CrossOrigin("http://localhost:8888")
    public int echo(@RequestBody String msg) {
        return superDataService.insert(msg);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
