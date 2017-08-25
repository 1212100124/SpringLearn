package com.channel.spring.list;

import com.channel.spring.beans.Car;

import java.util.List;

/**
 * Created by jackie on 17-8-24.
 */
public class Person {
    private String name;
    private List<Car> cars;

    public Person(){

    }
    public Person(String name, List<Car> cars) {
        this.name = name;
        this.cars = cars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }


    public String getName() {
        return name;
    }

    public List<Car> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cars=" + cars +
                '}';
    }
}
