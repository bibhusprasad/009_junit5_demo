package com.sg.math;

import com.sg.antman.AbstractTestJunit;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilsTest extends AbstractTestJunit<MathUtils> {

    @BeforeEach
    public void beforeEach(){
        System.out.println("Before every method");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("After every method");
    }

    @BeforeAll
    /*public static void beforeAll(){
        System.out.println("Before all");
    }*/
    //no need of static as TestInstance is PER_CLASS i.e. only one object will created for this class
    //default type is PER_METHOD
    public void beforeAll(){
        System.out.println("Before all");
    }
    @AfterAll
    /*public static void afterAll(){
        System.out.println("After all");
    }*/
    //no need of static as TestInstance is PER_CLASS i.e. only one object will created for this class
    //default type is PER_METHOD
    public void afterAll(){
        System.out.println("After all");
    }

    @Test
    @DisplayName("Add two number")
    public void testAdd(){
        int result = this.test.add(3,7);
        Assertions.assertEquals(10, result, "The add method should add two number");
    }

    @Test
    public void testComputeCircleArea(){
        double result = this.test.computeCircleArea(2);
        Assertions.assertEquals(12.56, result, "Calculate radios of circle");
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    public void testDivision(){
        Assertions.assertThrows(ArithmeticException.class, () -> this.test.division(4, 0), "Divided by Zero throws Exception");
    }

    @Test
    @Disabled
    @DisplayName("Skipp this method")
    public void testDisabled(){
        //    double result = this.test.division(4, 2);
        //    Assertions.assertEquals(2, result, "Division oif two number");
        Assertions.assertThrows(ArithmeticException.class, () -> this.test.division(4, 0), "Divided by Zero throws Exception");
    }

    @Test
    public void testDivisionAssumptions(){
        int x = 10;
        Assumptions.assumeTrue(x > 13);
        Assertions.assertThrows(ArithmeticException.class, () -> this.test.division(4, 0), "Divided by Zero throws Exception");
    }

    @Test
    @Tag("mul")
    public void testMultiple(){
        Assertions.assertAll(
                () -> Assertions.assertEquals(4, this.test.multiple(2, 2)),
                () -> Assertions.assertEquals(9, this.test.multiple(3, 3))
        );
    }
}
