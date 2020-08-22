package com.hayeon.delivery.domain;

public class Restaurant {
    private final String name;
    private final String address;

    public Restaurant(String name,String address){
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public String getInfo() {
        return name+"in"+address;

    }

    public String getAddress() {
        return address;
    }
}
