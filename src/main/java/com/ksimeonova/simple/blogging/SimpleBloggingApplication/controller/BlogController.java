package com.ksimeonova.simple.blogging.SimpleBloggingApplication.controller;

import com.ksimeonova.simple.blogging.SimpleBloggingApplication.service.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class BlogController {


    @Autowired
    BlogServiceImpl blogService;

    String index(){
        return "index";
    }

    @GetMapping("/blog/create")
    String create(){
        return "create";
    }

    @GetMapping("/blogs")
    public ModelAndView getBlogs(){
        ModelAndView blogs = new ModelAndView("blogs");
        blogs.addObject("blogs", blogService.getFirstFifteen());
        return blogs;
    }


}
