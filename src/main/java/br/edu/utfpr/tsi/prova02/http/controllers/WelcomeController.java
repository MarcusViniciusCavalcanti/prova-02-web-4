package br.edu.utfpr.tsi.prova02.http.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @GetMapping(value = "/")
    public String welcome() {
        return "welcome";
    }

    @GetMapping(value = "/test")
    public ModelAndView teste() {
        ModelAndView modelAndView = new ModelAndView("welcome");
        modelAndView.addObject("message", "deu tudo certo, mesmo!!");
        return modelAndView;
    }
}
