package com.projetolistacasamento.projeto_lista_casamento.model;

import jakarta.persistence.*;

@Entity // diz que isso vira uma tabela no banco
public class Presente {

    @Id // chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private Boolean comprado;
    private String quemDeu;

    // construtor vazio (obrigatório)
    public Presente() {}

    public Presente(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.comprado = false;
    }

    // getters e setters
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public Boolean getComprado() { return comprado; }
    public String getQuemDeu() { return quemDeu; }

    public void setNome(String nome) { this.nome = nome; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setComprado(Boolean comprado) { this.comprado = comprado; }
    public void setQuemDeu(String quemDeu) { this.quemDeu = quemDeu; }
}
