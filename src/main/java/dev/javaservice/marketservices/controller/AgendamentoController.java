package com.marketservices.controller;

import com.marketservices.model.Agendamento;
import com.marketservices.service.AgendamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    private final AgendamentoService service;

    public AgendamentoController(AgendamentoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Agendamento> listar() {
        return service.findAll();
    }

    @PostMapping
    public Agendamento salvar(@RequestBody Agendamento agendamento) {
        return service.save(agendamento);
    }
}
