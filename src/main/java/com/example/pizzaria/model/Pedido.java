package com.example.pizzaria.model;

import jakarta.persistence.*;

@Entity
public class Pedido {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    private Float valor;
    private String status;

    @ManyToOne
    private Cliente cliente;

    public Pedido(){}
    public Pedido(String descricao, Float valor, String status, Cliente cliente) {
        this.descricao = descricao;
        this.valor = valor;
        this.status = status;
        this.cliente = cliente;
    }

    public Integer getId() { return id; }
    public String getDescricao() { return descricao; }
    public Float getValor() { return valor; }
    public String getStatus() { return status; }
    public Cliente getCliente() { return cliente; }

    public void setId(Integer id) { this.id = id; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setValor(Float valor) { this.valor = valor; }
    public void setStatus(String status) { this.status = status; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
}
