package com.skirnevskyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
    @RequestMapping(value = {"/", "/home", "/index"})
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("greeting", "Welcome to spring MVC ");
        return mv;
    }

        @RequestMapping(value="/test/{greeting}")
        public ModelAndView test(@PathVariable("greeting") String name){
            if (name == null){
                name="Hello fellas";
            }
            ModelAndView mv = new ModelAndView("page");
            mv.addObject("greeting",  name);
            return mv;
        }
}