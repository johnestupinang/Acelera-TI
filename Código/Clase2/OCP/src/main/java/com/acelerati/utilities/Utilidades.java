package com.acelerati.utilities;

import com.acelerati.entities.Figura;

import java.util.List;

public class Utilidades {

    public double sumaTotalAreas(List<Figura> listaFiguras){

        double sumaTotal = 0.0;

        for (int i = 0; i < listaFiguras.size(); i++) {
            System.out.println("Area: "+listaFiguras.get(i).area());
            sumaTotal += listaFiguras.get(i).area();
        }

        return sumaTotal;
    }

}
