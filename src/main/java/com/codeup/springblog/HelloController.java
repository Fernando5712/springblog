package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello There - Obi Wan Kenobi";
    }

    @GetMapping("/goodbye")
    @ResponseBody
    public String goodbye(){
        return "Goodbye Goodbye to you my friend - Bears Big Blue House";
    }

    @GetMapping("/hello/{name}")
    @ResponseBody
    public String helloName(@PathVariable String name ){
        return "Aye " + name + " How you doing - Joey From Friends ";
    }


}
