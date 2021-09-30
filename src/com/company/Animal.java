package com.company;

import java.io.File;

public class Animal {
    final public String species;
    private Double weight;
    public String name;
    public File pic;
    private final static Double DEFAULT_ANIMAL_WEIGHT = 3.0;
    private static final Double DEFAULT_FOOD_WEIGHT = 0.250;

    public Animal(String species, Double weight, String name){
        this.species = species;
        this.weight = weight;
        this.name = name;
    }

    public Animal(String species, String name) {
        this.species = species;
        this.weight = DEFAULT_ANIMAL_WEIGHT;
        this.name = name;
    }

    void feed(){
        if (weight > 0) {
            weight += DEFAULT_FOOD_WEIGHT;
            System.out.print("Thx for food. My weight is now " + this.weight + "\n");
        } else
            System.out.print("Your pet died.\n");
    }

    void takeForAWalk() {
        if (weight > 0) {
            weight -= DEFAULT_FOOD_WEIGHT;
            System.out.print("Thx for walk. My weight is now " + this.weight + "\n");
        } else
            System.out.print("Your pet died.\n");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", pic=" + pic +
                ", weight=" + weight +
                '}';
    }
}