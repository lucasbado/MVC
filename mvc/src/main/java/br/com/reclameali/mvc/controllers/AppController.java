package br.com.reclameali.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
    @GetMapping("/hello-model")
    public String hello(Model model){
        model.addAttribute("name", "World");
        return "hello";
    }

    @GetMapping("/hello")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("name", "World");
        return mv;
    }
    
    @GetMapping("/hello-servelet")
    public String helloServelet(Model model){
        model.addAttribute("name", "World");
        return "hello-servelet";
    }

}
