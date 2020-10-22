package com.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("xml file has been loaded");

        Sim simInt = (Sim) context.getBean("sim");

        simInt.calling();
        simInt.data();


    }
}
