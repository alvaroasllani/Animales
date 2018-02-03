package com.company;

public class Gato extends AnimalDomestico {
    private String raza;
    public Gato(String nombre, String color, String raza) {
        super(nombre, color);
        this.raza = raza;
    }

    public void saludar() {
        System.out.println("miau miau");
    }
}
