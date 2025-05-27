package com.acelerati.entities;

public class Cuadrado extends Figura{

    private double lado;

    public Cuadrado(){}

    public Cuadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }
}
