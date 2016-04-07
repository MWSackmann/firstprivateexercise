package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Papagei billi = new Papagei();
        billi.setName("Billi");
        billi.setAge(5);

        Papagei hugo = new Papagei();
        hugo.setName("Hugo");
        hugo.setAge(2);

        System.out.println(billi.getName() + ", Age: " + billi.getAge());
        System.out.println(hugo.getName() + ", Age: " + hugo.getAge());

    }
}
