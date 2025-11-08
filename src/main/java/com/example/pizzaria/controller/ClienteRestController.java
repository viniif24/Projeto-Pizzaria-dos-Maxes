package com.example.pizzaria.controller;

import com.example.pizzaria.model.Cliente;
import com.example.pizzaria.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteRestController {
    private final ClienteService service;
    public ClienteRestController(ClienteService service) { this.service = service; }

    @GetMapping
    public List<Cliente> all() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> get(@PathVariable Integer id) {
        return service.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente) { return service.save(cliente); }
}
