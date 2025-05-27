package com.acelerati;

import com.acelerati.entiites.Email;
import com.acelerati.entiites.SMS;
import com.acelerati.entiites.ServicioAlerta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ServicioAlerta alertaEmail = new ServicioAlerta(new Email());
        alertaEmail.enviarAlerta("Enviando EMAIL");

        ServicioAlerta alertaSMS = new ServicioAlerta(new SMS());
        alertaSMS.enviarAlerta("Enviando SMS");
    }
}