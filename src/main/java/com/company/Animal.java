package com.company;

import java.util.Scanner;  //used for keyboard input

import static java.lang.System.out;

/**
 * Created by sackmann on 12.04.2016.
 */
public class Animal {

    public static final double FAVNUMBER = 1.6810;  // constant for all instances

    private String name;
    private int weight;
    private boolean hasOwner = false;
    private byte age;
    private long uniqueID;
    private char favoriteChar;
    private double speed;
    private float height;

    protected static int numberOfAnimals = 0;           // static means every instance share same value

    static Scanner userinput = new Scanner(System.in);  // we want data from the keyboard

    // constructor
    public Animal() {

//        numberOfAnimals++;    // increase with every instance
//
//        // do some math and print result
//        int sumOfnumbers = 5 + 1;
//        System.out.println("5 + 1 = " + sumOfnumbers);
//
//        int diffOfnumbers = 5 - 1;
//        System.out.println("5 - 1 = " + diffOfnumbers);
//
//        int multOfnumbers = 5 * 1;
//        System.out.println("5 * 1 = " + multOfnumbers);
//
//        int divOfnumbers = 5 / 1;
//        System.out.println("5 /  1 = " + divOfnumbers);
//
//        int modOfnumbers = 5 % 1;
//        System.out.println("5 % 1 = " + modOfnumbers);
//
//        // we want some imput from the keyboard
//        System.out.print("Enter the name: \n");
//        if (userinput.hasNextLine()){
//            // user entered a string, see also hasNextInt, hasNextFloat...
//            this.setName(userinput.nextLine());
//            System.out.println("Value entered: " + this.getName());
//        }
//        setUniqueID();
//
//        someOperations();
       }

    public static void main(String[] args){

        Animal theAnimal = new Animal();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public long getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(long uniqueID) {
        this.uniqueID = uniqueID;
        System.out.println("Unique ID set to: " + this.uniqueID);
    }
    // method overload
    public void setUniqueID() {
        long minNumber = 1;
        long maxNumber = 1000000;
        //(long) is used for casting as Math.random returns double
        this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber) +1 ) );

        // conversion
        String stringNumber = Long.toString(this.uniqueID);
        System.out.println(stringNumber);

        int numberString = Integer.parseInt(stringNumber);
        System.out.println(numberString);
    }

    public char getFavoriteChar() {
        return favoriteChar;
    }

    public void setFavoriteChar(char favoriteChar) {
        this.favoriteChar = favoriteChar;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void someOperations(){

        int randomInt = (int) (Math.random() + 10);
        System.out.println("Random Int: " + randomInt);

        //  &&  and
        //  ||  or
        //  !   not (return opposite for boolean !true returns false
        if (randomInt > 10 && randomInt < 100){
            System.out.println("if statment = true");
        } else {
            System.out.println("if statement = false");
        }

        // if randdomInt is smaller then 50 assign 50, otherwise assign randomInt
        int whichIsBigger = (50 > randomInt) ? 50 : randomInt;
        System.out.println(whichIsBigger);

        // case statement
        switch (randomInt){
            case 0:
                System.out.println("integer has initial value");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("integer is either 10, 11 or 12");
                break;
            default:   // like when others
                System.out.println("integer has some other value");
                break;
        }
    }
}
