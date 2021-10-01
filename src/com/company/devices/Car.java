package com.company.devices;

import com.company.Human;

public abstract class Car extends Device implements com.company.Salleable, Comparable<Car> {
    public String color;
    public Double value;

    public Car(String model, String producer, Integer yearofproduction, String color, Double value) {
        super(model, producer, yearofproduction, value);
        this.color = color;
        this.value = value;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (!seller.hasCar(this)) {
            System.out.println(("Nie udana tranzakcja, brak towaru."));
        } else if (!buyer.garageHasEmptyPlace()) {
            System.out.println(("Nie udana tranzakcja, Kupujący nie ma miejsca na nowy samochód"));
        } else if (buyer.cash < price) {
            System.out.println(("Nie udana tranzakcja, brak środków."));
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.addCar(this);
            seller.removeCar(this);
            System.out.println(("Udana tranzakcja, sprzedano " + this + " za " + price));
        }
    }
    @Override
    public int compareTo(Car car) {
        return this.yearofproduction - car.yearofproduction;
    }

    @Override
    public void turnOn() {
        System.out.println("Naciskam Start");
    }
    public abstract void refuel();
}