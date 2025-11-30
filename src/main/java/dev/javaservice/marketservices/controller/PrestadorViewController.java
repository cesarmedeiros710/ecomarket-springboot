package com.marketservices.controller;

import com.marketservices.service.PrestadorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrestadorViewController {

    private final PrestadorService prestadorService;

    public PrestadorViewController(PrestadorService prestadorService) {
        this.prestadorService = prestadorService;
    }

    @GetMapping("/usuarios")
    public String listarPrestadores(Model model) {
        model.addAttribute("infos", "Usuários");
        model.addAttribute("content", "prestadores");
        model.addAttribute("listaPrestadores", prestadorService.findAll());
        return "layout";
    }
}
