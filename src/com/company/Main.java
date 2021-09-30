package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog", 50.0, "Hawana");
        Animal cat = new Animal("cat", "Jinx");

        Phone phone1 = new Phone("Samsung", "S10", 2020, 6.1, "android");

        Human me = new Human("Przemek", "Podlecki", "123456789", dog);

        Car car1 = new Car("X3", "BMW", 2012, "Black", 24000.0);
        Car car2 = new Car("X3", "BMW", 2011, "Black", 24000.0);

        dog.feed();
        dog.takeForAWalk();

        cat.feed();
        cat.takeForAWalk();

        System.out.println("Pet name is: " + me.pet.name);

        me.getSalary();
        me.setSalary(3250);
        me.getSalary();

        System.out.println(me.getCar());
        me.setCar(car1);
        System.out.println(me.getCar());

        System.out.println(car1);
        System.out.println(phone1);
        phone1.turnOn();
        car1.turnOn();
    }
}