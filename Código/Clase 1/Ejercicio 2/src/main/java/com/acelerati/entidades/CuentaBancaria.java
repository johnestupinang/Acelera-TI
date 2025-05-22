package com.acelerati.entidades;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CuentaBancaria {

    String titular;
    Double saldo;

    //Métodos
    public void depositar(Double cantidad){
        this.saldo += cantidad;
    }

    public String retirar(Double cantidad){

        String valorRetirar = "";

        if(cantidad <= saldo){
            saldo = saldo-cantidad;
            valorRetirar = "Usted retiro el valor de: "+cantidad;
        }else{
            valorRetirar = "No puede retirar montos superiores a su saldo.";
        }

        return valorRetirar;
    }

    public String mostrarSaldo(){
        return "Su saldo es: "+saldo;
    }

}
