package com.example.pizzaria.model;

import jakarta.persistence.*;

@Entity
public class Atendente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String telefone;
    private Float saldo;
    private String senha;

    public Atendente() {}
    public Atendente(String nome, String telefone, Float saldo, String senha) {
        this.nome = nome;
        this.telefone = telefone;
        this.saldo = saldo;
        this.senha = senha;
    }

    public Integer getId() { return id; }
    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public Float getSaldo() { return saldo; }
    public String getSenha() { return senha; }

    public void setId(Integer id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setSaldo(Float saldo) { this.saldo = saldo; }
    public void setSenha(String senha) { this.senha = senha; }
}
