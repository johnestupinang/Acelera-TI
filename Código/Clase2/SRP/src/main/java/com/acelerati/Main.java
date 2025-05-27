package com.acelerati;

import com.acelerati.entities.Factura;
import com.acelerati.entities.impresoraFactura;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Factura nuevaFactura = new Factura("Juanito", 500);
        impresoraFactura factura = new impresoraFactura();

        factura.imprimir(nuevaFactura);
    }
}