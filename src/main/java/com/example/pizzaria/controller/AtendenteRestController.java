package com.example.pizzaria.controller;

import com.example.pizzaria.model.Atendente;
import com.example.pizzaria.service.AtendenteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/atendentes")
public class AtendenteRestController {
    private final AtendenteService service;
    public AtendenteRestController(AtendenteService service) { this.service = service; }

    @GetMapping
    public List<Atendente> all() { return service.findAll(); }

    @PostMapping
    public Atendente create(@RequestBody Atendente a) { return service.save(a); }
}
