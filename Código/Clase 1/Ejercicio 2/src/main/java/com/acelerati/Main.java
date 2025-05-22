package com.acelerati;

import com.acelerati.entidades.CuentaBancaria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setTitular("Juan Carlos");
        cuenta.setSaldo(500.0);

        cuenta.depositar(500.0);
        System.out.println(cuenta.retirar(100.0));
        System.out.println(cuenta.mostrarSaldo());

        System.out.println(cuenta.retirar(901.0));
        System.out.println(cuenta.retirar(900.0));
        System.out.println(cuenta.mostrarSaldo());


    }
}