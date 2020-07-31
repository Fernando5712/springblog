package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{number}/and/{num}")
    @ResponseBody
    public String add(@PathVariable int number, @PathVariable int num){
       return " this number " + number + " added by this number " + num + " will equal " + (number + num);
    }

    @GetMapping("/subtract/{num}/and/{num2}")
    @ResponseBody
    public String subtract(@PathVariable int num, @PathVariable int num2){
        return " this number " + num + " subtracted by this number " + num2 + " will equal " + (num - num2);
    }

    @GetMapping("/multiply/{num}/and/{num1}")
    @ResponseBody
    public String multiply(@PathVariable int num, @PathVariable int num1){
        return " this number " + num + " multiplied by this number " + num1 + " will equal " + (num * num1);
    }

    @GetMapping("/divide/{num}/and/{num2}")
    @ResponseBody
    public String divide(@PathVariable int num, @PathVariable int num2){
        return " this number " + num + " divided by this number " + num2 + " will equal " + (num/num2);
    }


}
