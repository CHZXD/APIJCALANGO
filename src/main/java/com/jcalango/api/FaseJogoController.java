﻿package com.jcalango.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/fases")
public class FaseJogoController {
    @GetMapping
    public int mostrarQtddeFases(){
        return 7;

    }

}
