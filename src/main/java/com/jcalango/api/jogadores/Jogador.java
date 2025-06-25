package com.jcalango.api.jogadores;
import jakarta.persistence.*;

@Table(name="jogador")
@Entity(name="jogador")

public class Jogador {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String nickNome;
    private String email;
    private String telefone;
    private String senha;
}