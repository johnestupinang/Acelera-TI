package com.acelerati;

public class EmpleadoPorHora extends Empleado{

    private int cantidadHoras;
    private double tarifa;

    public EmpleadoPorHora(int cantidadHoras, double tarifa){
        this.cantidadHoras = cantidadHoras;
        this.tarifa = tarifa;
    }

    @Override
    public double calcularSalario() {
        return cantidadHoras * tarifa;
    }
}
