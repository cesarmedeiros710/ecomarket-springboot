package com.marketservices.service;

import com.marketservices.model.Servico;
import com.marketservices.repository.ServicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    private final ServicoRepository servicoRepository;

    public ServicoService(ServicoRepository servicoRepository) {
        this.servicoRepository = servicoRepository;
    }

    public List<Servico> findAll() {
        return servicoRepository.findAll();
    }

    public Servico save(Servico servico) {
        return servicoRepository.save(servico);
    }
}
