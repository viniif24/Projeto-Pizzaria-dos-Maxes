package com.example.pizzaria.service;

import com.example.pizzaria.model.Cliente;
import com.example.pizzaria.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    private final ClienteRepository repo;
    public ClienteService(ClienteRepository repo) { this.repo = repo; }

    public Cliente save(Cliente c) { return repo.save(c); }
    public Optional<Cliente> findById(Integer id) { return repo.findById(id); }
    public List<Cliente> findAll() { return repo.findAll(); }
}
