package com.channel.spring.extendsAndDep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jackie on 17-8-25.
 */
public class Main {
    public static void main(String args[]){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationExtendContext.xml");
        Car car = (Car)ctx.getBean("car");
        System.out.println(car);

        Car car1 = (Car) ctx.getBean("car");
        // 单例模式，每次都是单个的
        System.out.println(car1 == car);

        Car car2 = (Car) ctx.getBean("car1");
        Car car3 = (Car) ctx.getBean("car1");
        System.out.println(car2 == car3);
    }
}
