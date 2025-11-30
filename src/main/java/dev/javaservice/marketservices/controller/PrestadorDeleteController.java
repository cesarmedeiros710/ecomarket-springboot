package com.marketservices.controller;

import com.marketservices.service.PrestadorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PrestadorDeleteController {

    private final PrestadorService prestadorService;

    public PrestadorDeleteController(PrestadorService prestadorService) {
        this.prestadorService = prestadorService;
    }

    @GetMapping("/prestadores/deletar/{id}")
    public String deletarPrestador(@PathVariable Long id) {
        prestadorService.deletarPrestador(id);
        return "redirect:/usuarios";
    }
}
