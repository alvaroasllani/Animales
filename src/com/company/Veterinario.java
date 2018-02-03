package com.company;

public class Veterinario {
    AnimalDomestico animal;

    public Veterinario(AnimalDomestico animal) {
        this.animal = animal;
    }
    public void curar (){
        System.out.println("Curando a un");
        if(animal instanceof Gato)
            System.out.println("Gato");

        else
            System.out.println("Perro");
        this.animal.saludar(); //enlace dinamico

    }
}
