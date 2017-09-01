package com.channel.spring.mysql;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;


/**
 * Created by jackie on 17-9-1.
 */
public class JDBCTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationMysql.xml");

        try {
            DataSource dataSource = ctx.getBean(DataSource.class);
            System.out.println(dataSource.getConnection());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
