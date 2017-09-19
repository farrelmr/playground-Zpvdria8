package com.javabullets.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyFirstSpringBootController {
    @RequestMapping("/myFirstSpringBootApplication")
    public String myFirstSpringBootApplication() {
        return "myFirstSpringBootApplication";
    }
}