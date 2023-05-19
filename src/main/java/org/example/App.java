package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

        Car ob=(Car) context.getBean("car");
        ob.drive();

        //Tyre t=(Tyre)context.getBean("tyre");
        //System.out.println(t);
    }
}