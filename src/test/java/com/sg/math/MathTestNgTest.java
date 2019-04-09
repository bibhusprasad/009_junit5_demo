package com.sg.math;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MathTestNgTest {

    @Test
    public void testAdd(){
        int result = new MathJunit().add(2,3);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void testSub(){
        int result = new MathJunit().subtract(2,3);
        Assert.assertEquals(result, -1);
    }
}
