package com.wahid.sir.stamasofttechnologyallproject.Class;

import java.lang.reflect.Field;

public class Country {

    public int id;
    public String name;
    public String country ;
    public String image;
    private int phone ;
    private double price ;

    public Country(int id, String name, String country, String image) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.image = image;
    }

    public Country(int id, String name, String image, int phone) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.phone = phone;
    }

    public Country(int id, String name, String image, double price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
