package com.autowired.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autoWiredQualifierBean.xml");

        Human human = context.getBean("humanHeart",Human.class);

        human.humanHeartMethod();
    }
}
