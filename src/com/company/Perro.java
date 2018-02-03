package com.company;

public class Perro extends AnimalDomestico {

    public Perro(String nombre, String color) {
        super(nombre, color);
    }

    public void saludar() {
        System.out.println("guau guau");
    }
}
