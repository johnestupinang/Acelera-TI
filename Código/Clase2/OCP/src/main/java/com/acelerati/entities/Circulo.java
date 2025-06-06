package com.acelerati.entities;

public class Circulo extends Figura{

    private double radio;

    public Circulo(){}

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}
