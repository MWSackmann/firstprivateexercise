package com.company;

import java.util.HashMap;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Papagei billi = new Papagei("Billi");
        billi.setAge(5);

        Papagei hugo = new Papagei("Hugo");
        hugo.setAge(2);

        System.out.println(billi.getName() + ", Age: " + billi.getAge());
        System.out.println(hugo.getName() + ", Age: " + hugo.getAge());

        demoArraysAndCollections();

    }

    static void demoArraysAndCollections() {

        // array
        String array[] = new String[3];
        array[0] = "Test1";
        array[1] = "Test2";
        array[2] = "Test3";

        for (String s : array) {
            System.out.println(s);
        }

        // collection vector
        Vector<String> table = new Vector<String>();
        table.add("Test11");
        table.add("Test22");
        table.add("Test33");

        for (String s : table) {
            System.out.println(s);
        }

        // collection hashtable
        HashMap<Integer, String> hashtable = new HashMap<>();
        hashtable.put(1, "Test111");
        hashtable.put(2, "Test222");
        hashtable.put(3, "Test333");

        for (int key : hashtable.keySet()) {
            System.out.println(hashtable.get(key));
        }
        // output from 1st line to end
        for (int i = 1; i <= hashtable.size(); i++) {
            System.out.println(hashtable.get(i));
        }

    }
}
