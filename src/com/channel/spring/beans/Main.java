package com.channel.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jackie on 17-8-24.
 */
public class Main {
    public static void main(String args[]){
        /*HelloWorld helloWorld = new HelloWorld();
        helloWorld.setName("Channel");*/


        /*
          1.创建Spring对象爱嗯
           ApplicationContext 容器类， ClassPathXmlApplicationContext 表示是src目录下配置文件
           ApplicationContext 代表IOC容器. 读取bean实例化bean之前需要实例化他
        */
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
        helloWorld.hello();

        Car car  =(Car) ctx.getBean("car");
        System.out.println(car);

        Car car1 =(Car) ctx.getBean("car1");
        System.out.println(car1);

        Person person = (Person) ctx.getBean(Person.class);
        System.out.println(person);
    }
}
