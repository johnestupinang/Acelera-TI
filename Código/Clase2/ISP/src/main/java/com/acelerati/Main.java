package com.acelerati;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ImpresoraBasica impresoraBasica = new ImpresoraBasica();
        impresoraBasica.imprimir();

        ImpresoraMultifuncional impresoraMultifuncional = new ImpresoraMultifuncional();
        impresoraMultifuncional.imprimir();
        impresoraMultifuncional.escanear();
    }
}