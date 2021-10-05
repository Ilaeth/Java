package com.company;

import java.util.Comparator;
import java.util.HashSet;

public class Application {
    String name;
    String version;
    Double price;
    public static HashSet<Application> allApplications = new HashSet<>();
    public static Comparator<Application> sortByName = Comparator.comparing(app -> app.name);
    public static Comparator<Application> sortByPrice = Comparator.comparingDouble(app -> app.price);

    public Application(String name, String version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
        allApplications.add(this);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
