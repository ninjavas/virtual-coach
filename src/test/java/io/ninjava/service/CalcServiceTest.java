package io.ninjava.service;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jean- on 2016-02-09.
 */
public class CalcServiceTest {

    private CalcService serviceToTest;

    @Before
    public void setUp() {
        serviceToTest = new CalcService();
    }

    @Test
    public void testAdd() {
        assertEquals(7, serviceToTest.add(2, 5));
    }

    @Test
    public void testSub() {
        assertEquals(-3, serviceToTest.sub(2, 5));
    }

}