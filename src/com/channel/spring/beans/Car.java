package com.channel.spring.beans;

/**
 * Created by jackie on 17-8-24.
 */
public class Car {
    private String brand;
    private String local ;
    private int count;
    private double price;

    public Car(String brand, String local, int count) {
        this.brand = brand;
        this.local = local;
        this.count = count;
    }

    public Car(String brand, String local, double price) {
        this.brand = brand;
        this.local = local;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", local='" + local + '\'' +
                ", count=" + count +
                ", price=" + price +
                '}';
    }
}
