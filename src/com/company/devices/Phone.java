package com.company.devices;

import com.company.Human;
import com.company.Application;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;

public class Phone extends Device implements com.company.Salleable {
    final public Double screenSize;
    final public String operationSystem;
    private static final String DEFAULT_SERVER_ADDRESS = "appserver.com";
    private static final String DEFAULT_Version = "latest";
    private static final String DEFAULT_PROTOCOL = "https";
    public HashSet<Application> applications = new HashSet<>();
    Human owner;

    public Phone(String model, String producer, Integer yearofproduction, Double screenSize, String operationSystem) {
        super(model, producer, yearofproduction);
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
        this.owner = owner;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone != this) {
            System.out.println(("Nie udana tranzakcja, brak towaru."));
        } else if (buyer.cash < price) {
            System.out.println(("Nie udana tranzakcja, brak środków."));
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.phone = seller.phone;
            seller.phone = null;
            System.out.println(("Udana tranzakcja, sprzedano " + this + " za " + price));
        }
    }

    @Override
    public void turnOn() {
        System.out.println("Przesuń ekran palcem, aby odblokować");
    }

    public void instalAnnApp(String nameAplication) {
        this.instalAnnApp(nameAplication, DEFAULT_Version);
    }

    public void instalAnnApp(String nameAplication, String version) {
        this.instalAnnApp(nameAplication, version, DEFAULT_SERVER_ADDRESS);
    }

    public void instalAnnApp(String nameAplication, String version, String serverAdres) {
        try {
            URL url = new URL(DEFAULT_PROTOCOL, serverAdres, nameAplication + "_" + version);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void installAnnApp(URL url) {
        System.out.println("pobiera aplikację " + url.getFile() + " z adresu " + url.getHost());
        System.out.println("instaluje aplikację " + url.getFile());
    }
}