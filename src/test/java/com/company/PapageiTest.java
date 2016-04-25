package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sackmann on 25.04.2016.
 */
public class PapageiTest {

    Papagei p;
    @Before
    public void setUp() throws Exception {

        p = new Papagei("Hugo", 1);
    }


    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getName() throws Exception {

        assertEquals("Hugo", p.getName());
    }

    @Test
    public void getAge() throws Exception {

        assertEquals(1, p.getAge());
    }

    @Test
    public void setAge() throws Exception {

        p.setAge(5);
        assertEquals(5, p.getAge());

    }
}