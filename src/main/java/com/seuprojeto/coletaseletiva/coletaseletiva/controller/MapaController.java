package com.seuprojeto.coletaseletiva.coletaseletiva.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapaController {

    @GetMapping("/mapa")
    public String mostrarMapa() {
        return "mapa"; // retorna o template mapa.html
    }
}
