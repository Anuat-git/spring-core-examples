package com.autowired.qualifier;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

    Heart heartActive;
// byName, byType autowired - if we have custmize constructor then we must we need to have default constructor


    public Human(Heart heartActive) {

            System.out.println("using constructor");
            this.heartActive = heartActive;
        }
    public void setHeartActive(Heart heartActive) {
        System.out.println("using setter");
        this.heartActive = heartActive;
    }

    public void humanHeartMethod() {

        heartActive.pump();
    }
}
