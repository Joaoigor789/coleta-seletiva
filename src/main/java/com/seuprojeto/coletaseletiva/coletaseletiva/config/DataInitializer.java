package com.seuprojeto.coletaseletiva.coletaseletiva.config;

import com.seuprojeto.coletaseletiva.coletaseletiva.model.PontoColeta;
import com.seuprojeto.coletaseletiva.coletaseletiva.repository.PontoColetaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner loadData(PontoColetaRepository pontoColetaRepository) {
        return args -> {
            if (pontoColetaRepository.count() == 0) {
                pontoColetaRepository.saveAll(List.of(
                        new PontoColeta("Lixo Doméstico - Bairro Central", null, "Orgânico", -23.551520, -46.633308),
                        new PontoColeta("Entulho de Obra - Zona Sul", null, "Entulho", -23.574658, -46.639204),
                        new PontoColeta("Resíduo Hospitalar - Vila Verde", null, "Hospitalar", -23.560123, -46.626701),
                        new PontoColeta("Recicláveis - Zona Leste", null, "Reciclável", -23.554987, -46.615432),
                        new PontoColeta("Eletrônicos - Centro", null, "Eletrônico", -23.550000, -46.630000)
                ));
            }
        };
    }
}
