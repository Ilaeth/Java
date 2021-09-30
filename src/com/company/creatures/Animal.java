package com.company.creatures;

import com.company.Human;
import com.company.Salleable;

import java.io.File;

public abstract class Animal implements Salleable, Feedable {
    final public String species;
    protected Double weight;
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

    public void feed() {
        if (weight > 0) {
            weight += DEFAULT_FOOD_WEIGHT;
            System.out.print("Animal weight is now " + this.weight + "\n");
        } else
            System.out.print("Your pet died.\n");
    }

    public void takeForAWalk() {
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet != this) {
            System.out.println(("Nie udana tranzakcja, brak towaru."));
        } else if (buyer.cash < price) {
            System.out.println(("Nie udana tranzakcja, brak środków."));
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println(("Udana tranzakcja, sprzedano " + this + " za " + price));
        }
    }
}