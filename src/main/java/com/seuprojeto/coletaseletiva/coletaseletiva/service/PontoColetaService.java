package com.seuprojeto.coletaseletiva.coletaseletiva.service;

import com.seuprojeto.coletaseletiva.coletaseletiva.model.PontoColeta;
import com.seuprojeto.coletaseletiva.coletaseletiva.repository.PontoColetaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PontoColetaService {

    private final PontoColetaRepository repository;

    public PontoColetaService(PontoColetaRepository repository) {
        this.repository = repository;
    }

    public List<PontoColeta> listarTodos() {
        return repository.findAll();
    }

    public PontoColeta salvar(PontoColeta ponto) {
        return repository.save(ponto);
    }
}
