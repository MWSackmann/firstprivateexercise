package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sackmann on 25.04.2016.
 */
public class MyLogTest {

    static Logger Logger = LoggerFactory.getLogger(MyLogTest.class);

    public static void main(String[] args) {

        System.out.println("Hello, now comes the logger");
        Logger.info("some logtext");
    }
}
