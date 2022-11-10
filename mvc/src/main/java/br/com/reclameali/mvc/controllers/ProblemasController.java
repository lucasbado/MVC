package br.com.reclameali.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProblemasController {

    @GetMapping("/problemas")
    public String index(Model model){
        model.addAttribute("name", "World");
        return "index";
    }
    
    
}
