package com.acelerati;

import com.acelerati.interfaces.IEscaneable;
import com.acelerati.interfaces.IImprimible;

public class ImpresoraMultifuncional implements IImprimible, IEscaneable {
    @Override
    public void escanear() {
        System.out.println("Escaneado....");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo....");
    }
}
