package com.sg.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathJunitTest {

    @Test
    public void testAdd(){
        int result = new MathJunit().add(2,3);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testSub(){
        int result = new MathJunit().subtract(2,3);
        Assertions.assertEquals(-1, result);
    }
}

