package com.dependencyinjection.setter;

public class Student {


    private int id;
    private String name;

    public Student() {
        System.out.println("default constructor");
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayStudenyInfo(){

        System.out.println("dispaly student details : Student name is "+name + " student id is "+id);

    }
}
