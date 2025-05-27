package com.acelerati.listas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListasApplication.class, args);
		
		List<String> nombres = new ArrayList<>();
		
		nombres.add("Ana");
		nombres.add("Luis");
		nombres.add("Fernando");
		nombres.add("Camila");
		nombres.add("Juan");
		
		for (int i=0; i < nombres.size(); i++) {			
			System.out.println("Nombre: "+nombres.get(i)+", posicion: "+(i+1));
			
		}
		
	}

}
