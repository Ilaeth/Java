package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.species = "dog";
        dog.name = "Hawana";
        dog.weight = 50.0;


        Phone samsung = new Phone();
        samsung.screenSize = 6.1;
        samsung.producer = "Samsung";
        samsung.model = "S10";
        samsung.operationSystem = "android";


        Human me = new Human();
        me.firstName = "Przemek";
        me.lastName = "Podlecki";
        me.phone = "Samsung S10";


    }
}