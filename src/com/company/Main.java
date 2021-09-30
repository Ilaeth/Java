package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog", "Hawana");
        Animal cat = new Animal("cat", 2.0, "Jinx");


        Phone samsung = new Phone("Samsung", "S10", 6.1, "android");


        Human me = new Human("Przemek", "Podlecki", "123456789", dog);


        dog.feed();
        dog.takeForAWalk();


        System.out.println("Pet name is: " + me.pet.name);


    }
}