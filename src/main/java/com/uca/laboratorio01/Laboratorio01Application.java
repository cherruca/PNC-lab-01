package com.uca.laboratorio01;

import com.uca.laboratorio01.services.MaterialService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.beans.BeanProperty;

@SpringBootApplication
public class Laboratorio01Application {

	public static void main(String[] args) {
		SpringApplication.run(Laboratorio01Application.class, args);
	}

	@Bean
	public CommandLineRunner run(MaterialService materialService) {
		return args -> {
			System.out.println("===== INICIANDO APP =====");
			materialService.getAllMaterials().forEach(material ->
					System.out.println("[HYRULE-DB] Nombre: " + material.getName()
						+ " | Categoría: " + material.getCategory().getName()
						+ " | Precio: " + material.getPrice() + " Rupias"
					));
		};
	}

}
