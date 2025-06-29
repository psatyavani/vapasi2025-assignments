package com.thoughtworks.inheritance;

public class Customer {
    String name;
    // Association
    Laptop laptop;

    Customer(String name, Laptop laptop) {
        this.name = name;
        this.laptop = laptop;
    }

    public void showDetails() {
        System.out.println("Customer: " + name);
        System.out.println(laptop);
        System.out.println("*******************************");
    }
}
