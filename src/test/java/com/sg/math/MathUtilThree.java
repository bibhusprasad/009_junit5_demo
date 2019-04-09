package com.sg.math;

import org.junit.jupiter.api.*;

public class MathUtilThree {

    MathUtils mathUtils;
    TestInfo info;
    TestReporter reporter;

    @BeforeEach
    public void init(TestInfo info, TestReporter reporter){
        this.info = info;
        this.reporter = reporter;
        mathUtils = new MathUtils();
    }

    @Test
    @Tag("math")
    public void testAdd(){
        reporter.publishEntry(info.getDisplayName()+"-"+info.getTags());
        int result = mathUtils.add(2,3);
        Assertions.assertEquals(5, result);
    }
}
