package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping("/post")
    @ResponseBody
    public String indexPage(){
        return " This is the index page ";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String viewPost(@PathVariable long id){
        return "Here you will see the posts, lets start with the id of " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public  String viewForm(){
        return "Here you will see the form for creating a post ";
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String createPost(){
        return "Here you can create a new post ";
    }
}
