package com.company;

/**
 * Created by sackmann on 07.04.2016.
 */
public class Papagei {
    private String name;
    private int age;
    // via this we can set some attributes during call of constructor
    public Papagei(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // we can have multiple contructor method with different import parameters
    public Papagei (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
