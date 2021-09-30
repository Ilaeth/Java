package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog", 50.0, "Hawana");
        Animal cat = new Animal("cat", "Jinx");

        Phone samsung = new Phone("Samsung", "S10", 6.1, "android");

        Human me = new Human("Przemek", "Podlecki", "123456789", dog);

        Car bmw = new Car("X3", "BMW", "Black", 24000.0);

        dog.feed();
        dog.takeForAWalk();

        cat.feed();
        cat.takeForAWalk();

        System.out.println("Pet name is: " + me.pet.name);

        me.getSalary();
        me.setSalary(3250);
        me.getSalary();

        System.out.println(me.getCar());
        me.setCar(bmw);
        System.out.println(me.getCar());
    }
}