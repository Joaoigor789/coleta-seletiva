package com.seuprojeto.coletaseletiva.coletaseletiva.controller;

import com.seuprojeto.coletaseletiva.coletaseletiva.model.PontoColeta;
import com.seuprojeto.coletaseletiva.coletaseletiva.service.PontoColetaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pontos")
public class PontoColetaController {

    private final PontoColetaService service;

    // Injeção via construtor (melhor prática)
    public PontoColetaController(PontoColetaService service) {
        this.service = service;
    }

    // Retorna todos os pontos
    @GetMapping
    public List<PontoColeta> listar() {
        return service.listarTodos();
    }

    // Adiciona um novo ponto
    @PostMapping
    public PontoColeta adicionar(@RequestBody PontoColeta ponto) {
        return service.salvar(ponto);
    }
}
