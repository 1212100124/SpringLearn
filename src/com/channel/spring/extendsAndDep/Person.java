package com.channel.spring.extendsAndDep;

/**
 * Created by jackie on 17-8-25.
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
