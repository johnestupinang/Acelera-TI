package com.acelerati.map;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MapApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapApplication.class, args);
		
		Map<String, String> agenda = new HashMap<>();
		
		agenda.put("Carlos", "123455");
		agenda.put("Camilo", "687855");
		agenda.put("Juanito", "342353");
		agenda.put("Pepito", "12236");
		
		
		for(String nombre : agenda.keySet()) {
			System.out.println(nombre+": "+agenda.get(nombre));
		}
		
	}

}
