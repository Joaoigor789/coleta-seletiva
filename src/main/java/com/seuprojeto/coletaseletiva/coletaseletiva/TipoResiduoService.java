package com.seuprojeto.coletaseletiva.coletaseletiva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoResiduoService {

    @Autowired
    private TipoResiduoRepository repository;

    public List<TipoResiduo> listarTodos() {
        return repository.findAll();
    }

    public void salvar(TipoResiduo residuo) {
        repository.save(residuo);
    }
}
