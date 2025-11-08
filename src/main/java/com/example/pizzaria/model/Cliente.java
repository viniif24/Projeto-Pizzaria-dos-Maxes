package com.example.pizzaria.model;

import jakarta.persistence.*;

@Entity
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String endereco;
    private String telefone;
    private Float saldo;
    private String senha;

    public Cliente() {}
    public Cliente(String nome, String endereco, String telefone, Float saldo, String senha) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.saldo = saldo;
        this.senha = senha;
    }

    public Integer getId() { return id; }
    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public String getTelefone() { return telefone; }
    public Float getSaldo() { return saldo; }
    public String getSenha() { return senha; }

    public void setId(Integer id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setSaldo(Float saldo) { this.saldo = saldo; }
    public void setSenha(String senha) { this.senha = senha; }
}
