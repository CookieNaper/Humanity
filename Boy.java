package com.company;

public class Boy extends Human{

    String chlen;

    public Boy(String name, int age, String chlen) {
        super(name, age);
        this.chlen = chlen;
    }

    public void greeting(){
        System.out.println("Hello, I am " + name + ". I am " + age + " y.o. Chlen: " + chlen + ".");
    }

    public void obliset(){
        System.out.println("Mne " + age + ", ya oblisel!");
    }

}
