package com.example.pizzaria.repository;

import com.example.pizzaria.model.Atendente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtendenteRepository extends JpaRepository<Atendente, Integer> {
}
