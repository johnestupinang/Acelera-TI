package com.acelerati;

import com.acelerati.entidades.Persona;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Persona jorge = new Persona("Jorge", 25);
        System.out.println(jorge.presentarse());

        Persona ana = new Persona();
        ana.setNombre("Ana Maria");
        ana.setEdad(19);
        System.out.print(ana.presentarse());

    }
}