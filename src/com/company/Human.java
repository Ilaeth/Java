package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;
import java.time.LocalTime;
import java.util.Arrays;

public class Human {
    public String firstName;
    public String lastName;
    public String phonenumber;
    public Animal pet;
    public Phone phone;
    private Double salary;
    public Double cash;
    private static final Integer DEFAULT_GARAGE_SIZE = 2;
    public Car[] garage;

    public Human(String firstName, String lastName, String phonenumber, Animal pet){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phonenumber = phonenumber;
        this.pet = pet;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Human(String firstName, String lastName, String phonenumber, Animal pet, Integer garageSize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phonenumber = phonenumber;
        this.pet = pet;
        this.garage = new Car[garageSize];
    }

    public Double getSalary() {
        System.out.println(LocalTime.now());
        System.out.println(salary);
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0)
            System.out.println("Salary below 0");
        else {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
            System.out.println("Nie zapomnij odebrać aneksu do umowy od pani Hani z kadr.");
            System.out.println("Zus i US już wiedzą o zmianie wypłaty.");
            this.salary = salary;
        }
    }

    public Car getCar(Integer garageNumber) {
        return garage[garageNumber];
    }

    public void setCar(Car car) {
        if (getSalary() > car.value) {
            System.out.println("Udało się zakupić samochód.");
            this.garage[this.garageFirstEmptyPlace()] = car;
        } else if (getSalary() > (car.value / 12)) {
            System.out.println("Udało się zakupić samochód, na kredyt.");
            this.garage[this.garageFirstEmptyPlace()] = car;
        } else
            System.out.println("Nie udało się zakupić samochód, zapisz się na studia i znajdź nową robotę albo idź po podwyżkę.");
    }

    public boolean hasCar(Car newCar) {
        for (Car car : garage) {
            if (car == newCar)
                return true;
        }
        return false;
    }

    public Double getGarageValue() {
        Double val = 0.0;
        for (Car car : garage) {
            val += car.value;
        }
        return val;
    }

    public void sortGarage() {
        Arrays.sort(garage);
    }

    public boolean garageHasEmptyPlace() {
        for (Car car : garage) {
            if (car == null)
                return true;

        }
        return false;
    }

    public void removeCar(Car carToRemove) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == carToRemove)
                garage[i] = null;
        }
    }

    public void addCar(Car newCar) {
        garage[garageFirstEmptyPlace()] = newCar;
    }

    public Integer garageFirstEmptyPlace() {
        int index = 0;
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                index = i;
                return index;
            }
        }
        return index;
    }

    public void printGarage() {
        for (Car car : garage) {
            System.out.println(car);
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pet=" + pet +
                ", phone='" + phonenumber + '\'' +
                ", salary=" + salary +
                '}';
    }
}