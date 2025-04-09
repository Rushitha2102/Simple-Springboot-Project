package com.itorizon.simpleWebAPP.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @RequestMapping("/greet")
    public String greet(){
        return "Welcome to learn Springbbot";
    }
}
