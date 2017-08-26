package com.channel.spring.factory;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 静态工厂方法
 * Created by jackie on 17-8-26.
 */
public class StaticFactotry {
     private static Map<String,Car> cars= new HashMap<>();

     static{
         cars.put("audi",new Car("Jackie","audi"));
         cars.put("baoma",new Car("Mike","baoma"));
     }

     public static Car getCar(String name){
         return cars.get(name);
     }
}
