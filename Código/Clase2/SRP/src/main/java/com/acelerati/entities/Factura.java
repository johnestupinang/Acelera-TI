package com.acelerati.entities;

public class Factura {

    private String nombreCliente;
    private Double montoTotal;

    public Factura(){}

    public Factura(String nombreCliente, double montoTotal){
        this.nombreCliente = nombreCliente;
        this.montoTotal = montoTotal;
    }

    public String getDetalle(){
        return "Cliente: "+nombreCliente+", monto: $"+montoTotal;
    }

}
