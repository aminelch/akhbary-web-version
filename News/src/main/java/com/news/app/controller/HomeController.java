package com.news.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {



//    @RequestMapping("/")
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("pageTitle","Welcome to my Awesome Dynamic Application");

        return "index2";
    }
}
