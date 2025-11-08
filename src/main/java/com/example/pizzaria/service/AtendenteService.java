package com.example.pizzaria.service;

import com.example.pizzaria.model.Atendente;
import com.example.pizzaria.repository.AtendenteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AtendenteService {
    private final AtendenteRepository repo;
    public AtendenteService(AtendenteRepository repo) { this.repo = repo; }

    public Atendente save(Atendente a) { return repo.save(a); }
    public Optional<Atendente> findById(Integer id) { return repo.findById(id); }
    public List<Atendente> findAll() { return repo.findAll(); }
}
