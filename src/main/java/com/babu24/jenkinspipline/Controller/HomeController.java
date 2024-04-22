package com.babu24.jenkinspipline.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String getMessage(){

        return "Welcome to xyz";
    }
}
