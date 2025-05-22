package com.acelerati;

import com.acelerati.entities.Animal;
import com.acelerati.entities.Perro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro();

        System.out.println(perro.hacerSonido());
    }
}