package com.diloose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("looseCouplingBeans.xml");

        Sprint sp = context.getBean("sim",Sprint.class);

        sp.activateService();



    }
}
