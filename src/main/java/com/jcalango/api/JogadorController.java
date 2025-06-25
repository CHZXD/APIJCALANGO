package com.jcalango.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcalango.api.jogadores.DadosCadastrarJogador;

@RestController
@RequestMapping("/Jogador")


public class JogadorController {

    // o que é Injeção de Dependência?

    @PostMapping
    public void cadastrar (@RequestBody DadosCadastrarJogador dados){
        //System.out.println(dados);
        

    }

}