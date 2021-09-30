package com.company;

import java.io.File;

public class Animal {
    final public String species;
    private Double weight;
    public String name;
    public File pic;
    private final static Double DEFAULT_WEIGHT = 5.0;


    public Animal(String species, Double weight, String name){
        this.species = species;
        this.weight = weight;
        this.name = name;
    }


    public Animal(String species, String name) {
        this.species = species;
        this.weight = DEFAULT_WEIGHT;
        this.name = name;
    }


    void feed(){
        if (weight > 0) {
            weight += 1;
            System.out.print("Thx for food.\n");
        } else
            System.out.print("Your pet died.\n");
    }


    void takeForAWalk() {
        if (weight > 0) {
            weight -= 1;
            System.out.print("Thx for walk.\n");
        } else
            System.out.print("Your pet died.\n");
    }


}