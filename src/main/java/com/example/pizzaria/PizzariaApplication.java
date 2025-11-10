package com.example.pizzaria;

import com.example.pizzaria.model.Atendente;
import com.example.pizzaria.model.Cliente;
import com.example.pizzaria.model.Estoque;
import com.example.pizzaria.model.Pedido;
import com.example.pizzaria.repository.AtendenteRepository;
import com.example.pizzaria.repository.ClienteRepository;
import com.example.pizzaria.repository.EstoqueRepository;
import com.example.pizzaria.repository.PedidoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PizzariaApplication {
    public static void main(String[] args) {
        SpringApplication.run(PizzariaApplication.class, args);
    }

    // Seed inicial com contas e cardápio
    @Bean
    CommandLineRunner initData(ClienteRepository clienteRepo,
                               AtendenteRepository atendenteRepo,
                               EstoqueRepository estoqueRepo,
                               PedidoRepository pedidoRepo) {
        return args -> {
            // clientes
            clienteRepo.save(new Cliente("Joao", "Rua A, 123", "11999990000", 50.0f, "senha1"));
            clienteRepo.save(new Cliente("Maria", "Av B, 45", "11988880000", 30.0f, "senha2"));

            // atendentes
            atendenteRepo.save(new Atendente("Carlos", "11977770000", 0.0f, "admin"));

            // cardápio / estoque
            estoqueRepo.save(new Estoque(10, 25.0f, "Margherita"));
            estoqueRepo.save(new Estoque(8, 30.0f, "Calabresa"));
            estoqueRepo.save(new Estoque(5, 35.0f, "Quatro Queijos"));

            // exemplo de pedido
            Cliente c = clienteRepo.findAll().stream().findFirst().orElse(null);
            if (c != null) {
                Pedido p = new Pedido("Margherita", 25.0f, "PENDENTE", c);
                pedidoRepo.save(p);
            }
            System.out.println("Seed data created.") ;
        };
    }
}