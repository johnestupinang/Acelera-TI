package com.acelerati.entiites;

import com.acelerati.interfaces.INotificador;

public class ServicioAlerta {

    INotificador notificador;

    public ServicioAlerta(INotificador notificador){
        this.notificador = notificador;
    }

    public void enviarAlerta(String mensaje) {
        notificador.enviarMensaje(mensaje);
    }

}
