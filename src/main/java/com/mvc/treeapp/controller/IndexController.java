package com.mvc.treeapp.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/")
    public ModelAndView index(){
        Authentication authentication = SecurityContextHolder
                                                      .getContext()
                                                      .getAuthentication();
        return new ModelAndView("index","login", authentication.getName() + " " + authentication.getAuthorities());
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
