package com.channel.spring.beans;

/**
 * Created by jackie on 17-8-24.
 */
public class HelloWorld {
    private String name ;

    public void setName(String name) {
        System.out.println("set Name");
        this.name = name;
    }

    public void hello(){
        System.out.println("HelloWorld "+this.name);
    }

}
