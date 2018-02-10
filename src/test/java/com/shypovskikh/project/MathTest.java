package com.shypovskikh.project;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {

    @Test
    public void testThreeAndTwo(){
        Math math = new Math(3,2 );
        int res = math.getSum();

        assertEquals(5, res);

    }

}