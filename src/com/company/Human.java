package com.company;

import java.time.LocalTime;

public class Human {
    public String firstName;
    public String lastName;
    protected String phone;
    public Animal pet;
    public Car car;
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
}