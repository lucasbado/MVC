package br.com.reclameali.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.reclameali.mvc.model.Problema;
import br.com.reclameali.mvc.repository.ProblemaRepository;


@Controller
@RequestMapping(value = "/Usuario")
public class ProblemaController {
    @Autowired
    private ProblemaRepository problemaRepository;

    @GetMapping("")
    public ModelAndView index() {
       List<Problema> problema = this.problemaRepository.findAll();
        ModelAndView mv = new ModelAndView("Usuario/index");
        mv.addObject("problema", problema);

        return mv;
    }
    }

