package com.company;

import com.company.creatures.Pet;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.LPG;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Pet dog = new Pet("dog", 50.0, "Hawana");
        Pet cat = new Pet("cat", "Jinx");

        Phone phone1 = new Phone("Samsung", "S10", 2020, 6.1, "android");

        Human me = new Human("Przemek", "Podlecki", "123456789", dog);
        Human brother = new Human( "Paweł", "Podlecki");

        Diesel car1 = new Diesel("X3", "BMW", 2012, "Black", 24000.0);
        LPG car2 = new LPG("X3", "BMW", 2011, "Black", 24000.0);
        Electric car3 = new Electric("3", "Tesla", 2021, "Red", 264990.0);

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

        me.cash = 1175.0;
        brother.cash = 150.0;
        me.pet.sell(me, brother, 100.0);
        me.car.sell(me, brother, 24000.0);
        brother.phone = phone1;
        brother.phone.sell(brother, me, 1000.0);

        car1.refuel();
        car2.refuel();
        car3.refuel();
    }
}