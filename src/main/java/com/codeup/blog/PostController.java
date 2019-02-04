package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String index(){
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    public String show(@PathVariable long id){
        return "view an individual post";
    }

    @GetMapping("/posts/create")
    public String showCreate(){
        return "view the form for creating a post\n";
    }

    @PostMapping("/posts/create")
    public String createPost(){
        return "create a new post";
    }

}
