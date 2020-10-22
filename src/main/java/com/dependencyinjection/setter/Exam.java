package com.dependencyinjection.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("setterbeans.xml");

        Student student1 = context.getBean("anu",Student.class);

        student1.displayStudenyInfo();

        Student student2 = context.getBean("advik",Student.class);

        student2.displayStudenyInfo();

        Student student3 = context.getBean("anuCons",Student.class);

        student3.displayStudenyInfo();

    }



}
