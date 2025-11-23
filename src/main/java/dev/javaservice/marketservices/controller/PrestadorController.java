package com.marketservices.controller;

import com.marketservices.model.Prestador;
import com.marketservices.service.PrestadorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestadores")
public class PrestadorController {

    private final PrestadorService prestadorService;

    public PrestadorController(PrestadorService prestadorService) {
        this.prestadorService = prestadorService;
    }

    @GetMapping
    public List<Prestador> listar() {
        return prestadorService.findAll();
    }

    @PostMapping
    public Prestador salvar(@RequestBody Prestador prestador) {
        return prestadorService.save(prestador);
    }
}
