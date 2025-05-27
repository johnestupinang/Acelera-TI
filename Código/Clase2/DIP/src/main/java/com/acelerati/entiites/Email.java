package com.acelerati.entiites;

import com.acelerati.interfaces.INotificador;

public class Email implements INotificador {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("EMAIL: "+mensaje);
    }
}
