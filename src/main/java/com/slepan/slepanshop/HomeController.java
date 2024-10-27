package com.slepan.slepanshop;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "homepage";
    }
    @GetMapping("/login")
    public String login() {
        return "reglog";
    }
    @GetMapping("/account")
    public String account() {
        return "account";
    }
}
