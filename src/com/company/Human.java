package com.company;

import com.company.devices.Car;
import java.time.LocalTime;

public class Human {
    public String firstName;
    public String lastName;
    protected String phone;
    public Animal pet;
    private Car car;
    private Double salary;

    public Human(String firstName, String lastName, String phone, Animal pet){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pet = pet;
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (getSalary() > car.value) {
            System.out.println("Udało się zakupić samochód.");
            this.car = car;
        } else if (getSalary() > (car.value / 12)) {
            System.out.println("Udało się zakupić samochód, na kredyt.");
            this.car = car;
        } else
            System.out.println("Nie udało się zakupić samochód, zapisz się na studia i znajdź nową robotę albo idź po podwyżkę.");
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pet=" + pet +
                ", car=" + car +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                '}';
    }
}