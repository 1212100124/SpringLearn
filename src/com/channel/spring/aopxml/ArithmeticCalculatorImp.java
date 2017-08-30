package com.channel.spring.aopxml;

import org.springframework.stereotype.Component;

/**
 * Created by jackie on 17-8-30.
 */

//@Component("arithmeticCalculator")
public class ArithmeticCalculatorImp implements ArithmeticCalculator{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }
}
