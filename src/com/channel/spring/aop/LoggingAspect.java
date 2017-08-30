package com.channel.spring.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


/**
 * Created by jackie on 17-8-29.
 */
@Aspect
@Component
public class LoggingAspect {


    /*
    *
    * 在方法执行之前的代码
    * */
    @Before("execution(public int com.channel.spring.aop.ArithmeticCalculator.add(int,int))")
    public void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("before my function "+methodName+ " args :"+args);
    }

    /*
    * 在方法执行之后执行的代码，无论该方法是否出现异常
    * */
    @After("execution(public int com.channel.spring.aop.ArithmeticCalculator.add(int,int))")
    public void AfterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("finish my function "+methodName+ " args :"+args);
    }

    /*
    * 在方法正常结束后执行的代码
    * 返回通知是可以访问到方法的返回值的！
    * */
    @AfterReturning("execution(public int com.channel.spring.aop.ArithmeticCalculator.add(int,int))")
    public void AfterReturn(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("Return my function "+methodName+ " args :"+args);
    }

    /*
    *   异常通知
    * */
    @AfterThrowing("execution(public int com.channel.spring.aop.ArithmeticCalculator.add(int,int))")
    public void AfterThrowing(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("Exception "+methodName+ " args :"+args);
    }
}
