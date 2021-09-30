package com.company;

public class Human {
    public String firstName;
    public String lastName;
    protected String phone;
    public Animal pet;


    public Human(String firstName, String lastName, String phone, Animal pet){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pet = pet;
    }
}