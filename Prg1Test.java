package com.firstprogram.prg1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Prg1Test {

    public static void main(String[] args) {
        SpringApplication.run(Prg1Test.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer.getName()); 
        System.out.println(customer.getAddress()); 
    }

}
