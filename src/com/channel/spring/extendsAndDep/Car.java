package com.channel.spring.extendsAndDep;

/**
 * Created by jackie on 17-8-25.
 */
public class Car {
    private String name;

    private String brand;

    public Car(){

    }

    public Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
