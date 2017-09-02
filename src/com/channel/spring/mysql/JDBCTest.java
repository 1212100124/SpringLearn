package com.channel.spring.mysql;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


/**
 * Created by jackie on 17-9-1.
 */
public class JDBCTest {
    private static ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationMysql.xml");
    private static  JdbcTemplate jdbcTemplate = ctx.getBean(JdbcTemplate.class);
    public static void main(String[] args) {

        try {

            DataSource dataSource = ctx.getBean(DataSource.class);
            System.out.println(dataSource.getConnection());
            update();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void update(){
        String sql="UPDATE Name SET name = ? WHERE id = ?";
        jdbcTemplate.update(sql,"channel",1);
    }
}
