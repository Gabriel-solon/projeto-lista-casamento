package com.projetolistacasamento.projeto_lista_casamento.repository;

import com.projetolistacasamento.projeto_lista_casamento.model.Presente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresenteRepository extends JpaRepository<Presente, Long> {
}
