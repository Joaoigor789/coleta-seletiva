package com.seuprojeto.coletaseletiva.coletaseletiva.repository;

import com.seuprojeto.coletaseletiva.coletaseletiva.model.PontoColeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PontoColetaRepository extends JpaRepository<PontoColeta, Long> {
}
