package com.acelerati;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empleado nuevoEmpleadoTC = new EmpleadoTiempoCompleto();
        Empleado nuevoEmpleadoPH = new EmpleadoPorHora(8, 30);

        List<Empleado> listaEmpleado = new ArrayList<>();

        listaEmpleado.add(nuevoEmpleadoTC);
        listaEmpleado.add(nuevoEmpleadoPH);

        for (int i = 0; i < listaEmpleado.size(); i++) {
            System.out.println("Salario: "+listaEmpleado.get(i).calcularSalario());
        }

    }
}