package com.wahid.sir.stamasofttechnologyallproject;

import java.lang.reflect.Field;

public class Country {

    public String id;
    public String name;
    public String country ;
    public String image;

    public Country(String id, String name, String country, String image) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
}
