package com.seduc2.reddead.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Escolha o nome do seu personagem.")
    private String nome;
    @NotBlank(message = "Escolha a sua organização.")
    private String organizacao;
    @NotBlank(message = "Escolha o seu gênero.")
    private Genero genero;
    @Positive
    private int idade;

    public Personagem(){}

    public Personagem(String nome, String organizacao, Genero genero, int idade) {
        this.nome = nome;
        this.organizacao = organizacao;
        this.genero = genero;
        this.idade = idade;
    }

    public Personagem(int id, String nome, String organizacao, Genero genero, int idade) {
        this.id = id;
        this.nome = nome;
        this.organizacao = organizacao;
        this.genero = genero;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrganizacao() {
        return organizacao;
    }

    public void setOrganizacao(String organizacao) {
        this.organizacao = organizacao;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
