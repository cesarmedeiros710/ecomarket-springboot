package com.marketservices.controller;

import com.marketservices.model.Servico;
import com.marketservices.service.ServicoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicoController {

    private final ServicoService servicoService;

    public ServicoController(ServicoService servicoService) {
        this.servicoService = servicoService;
    }

    @GetMapping
    public List<Servico> listar() {
        return servicoService.findAll();
    }

    @PostMapping
    public Servico salvar(@RequestBody Servico servico) {
        return servicoService.save(servico);
    }
}
