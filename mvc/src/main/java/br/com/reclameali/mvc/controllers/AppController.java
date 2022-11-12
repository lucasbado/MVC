package br.com.reclameali.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AppController {

    @GetMapping("/hello")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView("hello");  // nome do arquivo html a ser renderizado/exibido
        mv.addObject("nome", "Maria!");
        return mv;  // o Spring vai renderizar o arquivo templates/hello.html
    }

}
