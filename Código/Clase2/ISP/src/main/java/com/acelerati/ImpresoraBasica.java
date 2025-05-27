package com.acelerati;

import com.acelerati.interfaces.IImprimible;

public class ImpresoraBasica implements IImprimible {
    @Override
    public void imprimir() {
        System.out.println("Imprimiendo....");
    }
}
