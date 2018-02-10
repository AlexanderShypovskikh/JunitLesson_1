package com.shypovskikh.project;

import org.junit.Test;

import static org.junit.Assert.*;

public class DummyExampleClassTest {

    @Test
    public void testUserCount(){
        DummyExampleClass dec = new DummyExampleClass();
        dec.addUser("alex", "123");
        int count = dec.getUserCount();

        assertEquals(1, count);

    }

}