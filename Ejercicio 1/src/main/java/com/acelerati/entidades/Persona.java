package com.acelerati.entidades;

public class Persona {

    private String nombre;
    private int edad;

    public Persona(){}

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //getter y setter
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }


    //Métodos
    public String presentarse(){

        return "Hola, soy "+nombre+" y tengo "+edad+" años.";

    }

}
