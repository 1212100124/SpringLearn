package com.channel.spring.beans;

/**
 * Created by jackie on 17-8-24.
 */
public class Person {
    private String name;
    private Car car;

    public Person(){

    }

    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
