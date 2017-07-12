package com.in28minutes.junit.helper;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author peter
 */
public class ArraysCompareTest {

    // It's OK to put some setupcode in the class itself.
    // Maybe this should be in the setUpClass method.
   
    static StringHelper instance;

    static final int ARRAY_SIZE = 10000000;
    static long numbers[] = new long[ARRAY_SIZE];

    @BeforeClass
    public static void setUpClass() {
        for (int i=0; i<ARRAY_SIZE; i++) {
            numbers[i] = 1+Math.round(Math.random()*ARRAY_SIZE);
        }
        instance = new StringHelper();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testArraySort_RandomArray() {
        int numbers[] = {12, 3, 4, 1};
        int expected[] = {1, 3, 4, 12};
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }
    
    @Test(expected=NullPointerException.class)
    public void testArraySort_NullArray() {
        int numbers[] = null;
        Arrays.sort(numbers);
    }

    @Test(timeout=2000)
    public void testArraySort_Performance() {

        Arrays.sort(numbers);

    }

}
