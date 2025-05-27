package com.acelerati.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SetApplication {

	public static void main(String[] args) {
		SpringApplication.run(SetApplication.class, args);
		
		List<String> animales = Arrays.asList("Perro","Gato","Perro","Pajaro");
		
		Set<String> animalesSinDuplicados = new HashSet<>(animales);
		
		System.out.println("Lista con duplicados: "+animales);
		System.out.println("Lista sin duplicados: "+animalesSinDuplicados);
		
	}

}
