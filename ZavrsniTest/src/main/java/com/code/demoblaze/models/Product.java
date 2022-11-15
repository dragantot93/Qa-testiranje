package com.code.demoblaze.models;

public class Product {

    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name) {
        this.name = name;

    }

    public Product(int price) {
        this.price = price;
    }

}
