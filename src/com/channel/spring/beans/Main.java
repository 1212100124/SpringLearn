package com.channel.spring.beans;

import com.channel.spring.list.MapPerson;
import com.channel.spring.list.proPerson;
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

        Person person = (Person) ctx.getBean("person");
        System.out.println(person);

        Person person1 = (Person) ctx.getBean("person1");
        System.out.println(person1);

        com.channel.spring.list.Person person2 = (com.channel.spring.list.Person) ctx.getBean("person2");
        System.out.println(person2);

        MapPerson person3 = (MapPerson) ctx.getBean("person3");
        System.out.println(person3);

        proPerson person4 = (proPerson) ctx.getBean("person4");
        System.out.println(person4);

        printLine();
        com.channel.spring.list.Person person5 = (com.channel.spring.list.Person) ctx.getBean("person5");
        System.out.println(person5);
    }

    public static void printLine(){
        System.out.println("-------------------");
    }
}
