package com.acelerati;

import com.acelerati.entities.Circulo;
import com.acelerati.entities.Cuadrado;
import com.acelerati.entities.Figura;
import com.acelerati.utilities.Utilidades;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Figura> listaFiguras = new ArrayList<>();

        Figura cuadrado = new Cuadrado(2);
        Figura circulo = new Circulo(5);

        listaFiguras.add(cuadrado);
        listaFiguras.add(circulo);

        Utilidades utilidades = new Utilidades();
        System.out.println("Total: "+utilidades.sumaTotalAreas(listaFiguras));
    }
}