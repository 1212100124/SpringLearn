package com.channel.spring.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jackie on 17-8-26.
 */
public class Main{
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationStatic.xml");
        Car car = (Car)ctx.getBean("car");
        System.out.println(car);
        Car car1 = (Car)ctx.getBean("car1");
        System.out.println(car1);
    }
}
