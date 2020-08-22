package com.hayeon.delivery.domain;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private final String name;
    private final String address;
    private final Long id;
    private List<MenuItem> menuItems = new ArrayList< MenuItem>();

    public Restaurant(Long id,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return name+"in"+address;

    }

    public Long getId(){
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void addMenuItem(MenuItem menuItem){
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems(){
        return menuItems;
    }

    public void setMenuItem(List<MenuItem> menuItems) {
        for(MenuItem menuItem:menuItems){
            addMenuItem(menuItem);
        }
    }
}
