package com.company;

public class Main {

    public static void main(String[] args) {
        AnimalDomestico g;
        AnimalDomestico p;
        Veterinario vet;

        g = new com.company.Gato("Tom", "Gris", "chihuaha");
        g.saludar();
        /*p = new com.company.Perro("Beto", "Marron");
        g.saludar();*/

        vet = new Veterinario(g);
        vet.curar();

    }
}
