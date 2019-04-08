package com.sg.math;

import org.junit.jupiter.api.*;

import com.sg.antman.AbstractTestJunit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilsOne extends AbstractTestJunit<MathUtils> {

    @Nested
    class AddTest extends AbstractTestJunit<MathUtils>{
        @Test
        public void testAddPosNo(){
            int result = this.test.add(2,3);
            Assertions.assertEquals(5, result);
        }

        @Test
        public void testAddNegNo(){
            int result = this.test.add(2,-3);
            Assertions.assertEquals(-1, result, ()->"failed");
        }
    }

    @RepeatedTest(3)
    public void testSubtract(RepetitionInfo info){
        int no = info.getCurrentRepetition();
        System.out.println(no);
        int result = this.test.subtract(2,-3);
        Assertions.assertEquals(5, result);
    }


    @Tag("multi")
    @Test
    public void testMultiple(){
        int result = this.test.multiple(2,-3);
        Assertions.assertEquals(-6, result);
    }


}
