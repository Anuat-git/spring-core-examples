package com.dependency.injection;

public class Verizon implements Sim {
    @Override
    public void calling() {

        System.out.println("calling from Verizon");

    }

    @Override
    public void data() {

        System.out.println("using data from Verizon");

    }
}
