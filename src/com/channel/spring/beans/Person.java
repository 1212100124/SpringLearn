package com.channel.spring.beans;

/**
 * Created by jackie on 17-8-24.
 */
public class Person {
    private String name;
    private Car car;

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
