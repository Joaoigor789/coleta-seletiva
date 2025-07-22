package com.seuprojeto.coletaseletiva.coletaseletiva;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ColetaseletivaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColetaseletivaApplication.class, args);
	}

	@Bean
	CommandLineRunner run(TipoResiduoRepository repository) {
		return args -> {
			repository.save(new TipoResiduo("Vidro"));
			repository.save(new TipoResiduo("Plástico"));
			repository.save(new TipoResiduo("Metal"));
			repository.save(new TipoResiduo("Papel"));
			repository.save(new TipoResiduo("Garrafa PET"));
		};
	}
}
