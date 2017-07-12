package com.in28minutes.junit.helper;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author peter
 */
@RunWith(Parameterized.class)
public class StringHelperParameterizedTest1 {

    // It's OK to put some setupcode in the class itself.
    // Maybe this should be in the setUpClass method.
   
    StringHelper instance = new StringHelper();

    private final String testInput;
    private final String testOutput;
    
    public StringHelperParameterizedTest1(String testInput, String testOutput) {
       this.testInput  = testInput;
       this.testOutput = testOutput;
    }
    
    @Parameters
    public static Collection<String[]> testConditions() {

        String[][] tests = {
            {"AACD","CD"},
            {"ACD","CD"},
            {"CDEF","CDEF"},
            {"CDAA","CDAA"}
        };

        return Arrays.asList(tests);

    }
    

    @BeforeClass
    public static void setUpClass() {
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

    /**
     * Test of truncateAInFirst2Positions method, of class StringHelper.
     */
    @Test
    public void testTruncateAInFirst2Positions() {

        System.out.println("truncateAInFirst2Positions");

        assertEquals(testOutput, instance.truncateAInFirst2Positions(testInput));

    }

 
    
}
