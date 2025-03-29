package com.portfolio.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/portfolio")
    public String homePage(Model model){
        model.addAttribute("title", "Home:Portfolio");
        return "home";
    }

    @RequestMapping("/skills")
    public String mySkils(Model model){

        model.addAttribute("title", "Technical Skills");
        return "skills";
    }

    @RequestMapping("/about")
    public String aboutPage(Model model){
        model.addAttribute("title", "About Me");
        return "about";
    }
}
