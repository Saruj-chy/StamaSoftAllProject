package com.wahid.sir.stamasofttechnologyallproject.Class;

public class Product {
    int id;
    String name, des, price, entrydate ;

    public Product(int id, String name, String des, String price, String entrydate) {
        this.id = id;
        this.name = name;
        this.des = des;
        this.price = price;
        this.entrydate = entrydate;
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

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(String entrydate) {
        this.entrydate = entrydate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", entrydate='" + entrydate + '\'' +
                '}'+"\n";
    }
}
