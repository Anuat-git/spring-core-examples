package com.dependency.injection;

public class Sprint implements Sim {
    @Override
    public void calling() {
        System.out.println("calling from Sprint");

    }

    @Override
    public void data() {
        System.out.println("using data from Sprint");

    }
}
