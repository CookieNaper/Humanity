package com.company;

public class Girl extends Human{

    String face;

    public Girl(String name, int age, String face) {
        super(name, age);
        this.face = face;
    }

    public void greeting(){
        System.out.println("Hello, I am " + name + ". I am " + age + " y.o. Face: " + face + ".");
    }

    public void zaebali(){
        System.out.println("Ya " + name + ", menya vse zaebali!");
    }

}
