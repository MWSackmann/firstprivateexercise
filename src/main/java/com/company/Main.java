package com.company;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {

/*
        Papagei billi = new Papagei("Billi");
        billi.setAge(5);

        Papagei hugo = new Papagei("Hugo");
        hugo.setAge(2);

        System.out.println(billi.getName() + ", Age: " + billi.getAge());
        System.out.println(hugo.getName() + ", Age: " + hugo.getAge());
*/

        demoArraysAndCollections();
    //    demoDateAndTime();

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


        // collection List
        List<String> liste = new ArrayList<>();  // or  LinkedList<>();
        liste.add("Test1111");
        liste.add("Test2222");
        liste.add("Test3333");

        for (String s : liste){
            System.out.println(s);
        }

        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(new OrderItem("1", "first itme"));
        orderItems.add(new OrderItem("1.2.1", "2nd sub-sub item"));
        orderItems.add(new OrderItem("1.1.1", "1st sub-sub item"));
        orderItems.add(new OrderItem("1.2", "2nd sub item"));
        orderItems.add(new OrderItem("1.1", "1st sub item"));

        Collections.sort(orderItems, new Comparator<OrderItem>() {
            @Override
            public int compare(OrderItem lhs, OrderItem rhs) {
                // -1 - less than, 1 - greater than, 0 - equal, all inversed for descending
                return lhs.getLineNumber().compareTo(rhs.getLineNumber());
            }
        });

        for (OrderItem orderItem : orderItems){
            System.out.println(orderItem.getLineNumber() + " " + orderItem.getText());
        }


    }
    static void demoDateAndTime(){

        Date date  = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String formattedDate = sdf.format(date);

        System.out.println(date);
        System.out.println(date.toString());
        System.out.println(sdf.format(date));

        Calendar calendar = Calendar.getInstance();
        Timestamp currentTimestamp = new Timestamp(calendar.getTime().getTime());
        System.out.println(currentTimestamp);
    }
}
