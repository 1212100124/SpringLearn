package com.channel.spring.list;

import com.channel.spring.beans.Car;

import java.nio.MappedByteBuffer;
import java.util.List;
import java.util.Map;

/**
 * Created by jackie on 17-8-24.
 */
public class MapPerson {
    private String name;
    private Map<String,Car> stringCarMap;

    public MapPerson(String name, Map<String, Car> stringCarMap) {
        this.name = name;
        this.stringCarMap = stringCarMap;
    }

    public MapPerson(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStringCarMap(Map<String, Car> stringCarMap) {
        this.stringCarMap = stringCarMap;
    }

    public String getName() {
        return name;
    }

    public Map<String, Car> getStringCarMap() {
        return stringCarMap;
    }

    @Override
    public String toString() {
        return "MapPerson{" +
                "name='" + name + '\'' +
                ", stringCarMap=" + stringCarMap +
                '}';
    }
}
