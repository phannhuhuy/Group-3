package com.tuanzeebee.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {
    
    @GetMapping("/register")
    public String showRegistrationPage() {
        return "register";
    }

}
