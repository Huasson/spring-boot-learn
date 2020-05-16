package com.huasson.controllor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllor {


    @GetMapping("sayHello")
    public String sayHello(){
        return "hello world ";
    }
}
