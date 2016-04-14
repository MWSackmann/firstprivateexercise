package com.company;

public class Main {

    public static void main(String[] args) {

        Papagei billi = new Papagei("Billi");
        billi.setAge(5);

        Papagei hugo = new Papagei("Hugo");
        hugo.setAge(2);

        System.out.println(billi.getName() + ", Age: " + billi.getAge());
        System.out.println(hugo.getName() + ", Age: " + hugo.getAge());


    }
}
