package com.admin.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MainController {
    @GetMapping("/admin")
    public String main(){
        return "index";
    }
}
