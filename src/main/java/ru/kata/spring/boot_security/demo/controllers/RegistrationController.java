package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "auth/login";
    }


    @GetMapping("/logout")
    public String showLogoutPage() {
        return "auth/logout";
    }
}
