package com.projetolistacasamento.projeto_lista_casamento.controller;

import com.projetolistacasamento.projeto_lista_casamento.model.Presente;
import com.projetolistacasamento.projeto_lista_casamento.repository.PresenteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/presentes")
public class PresenteController {

    private final PresenteRepository repository;

    public PresenteController(PresenteRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Presente criar(@RequestBody Presente presente) {
        presente.setComprado(false);
        return repository.save(presente);
    }

    @GetMapping
    public List<Presente> listar() {
        return repository.findAll();
    }
}
