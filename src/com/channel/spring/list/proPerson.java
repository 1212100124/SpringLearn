package com.channel.spring.list;

import com.channel.spring.beans.Car;

import java.util.Map;
import java.util.Properties;

/**
 * Created by jackie on 17-8-24.
 */
public class proPerson {
    private String name;
    private Properties pros;

    public proPerson(String name, Properties pros) {
        this.name = name;
        this.pros = pros;
    }

    @Override
    public String toString() {
        return "proPerson{" +
                "name='" + name + '\'' +
                ", pros=" + pros +
                '}';
    }
}
