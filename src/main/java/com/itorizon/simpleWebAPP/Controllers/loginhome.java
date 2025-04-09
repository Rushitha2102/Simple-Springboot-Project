package com.itorizon.simpleWebAPP.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginhome {
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
