package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    public String landingPage(){ return "Home"; }

    @PostMapping("/")
    public String cohort(@RequestParam(name = "cohort") String cohort, Model model){
        model.addAttribute("cohort", cohort );
        return "Home";
    }

}