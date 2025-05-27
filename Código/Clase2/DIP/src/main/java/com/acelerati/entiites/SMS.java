package com.acelerati.entiites;

import com.acelerati.interfaces.INotificador;

public class SMS implements INotificador {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("SMS: "+mensaje);
    }


}
