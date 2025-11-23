package com.marketservices.repository;


import com.marketservices.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
}
