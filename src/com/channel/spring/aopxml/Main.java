package com.channel.spring.aopxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jackie on 17-8-29.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationAop.xml");
        ArithmeticCalculator arithmeticCalculator= ctx.getBean(ArithmeticCalculator.class);
        System.out.println("result: "+arithmeticCalculator.add(1,2));
    }
}
