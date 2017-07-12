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
public class StringHelperParameterizedTest2 {

    // It's OK to put some setupcode in the class itself.
    // Maybe this should be in the setUpClass method.
   
    StringHelper instance = new StringHelper();

    
    private final String testInput;
    private final boolean testInputTrue;

    
    public StringHelperParameterizedTest2(String testInput, String testInputTrue) {
        this.testInput      = testInput;
        this.testInputTrue  = testInputTrue.equals("T");
    }

    
    @Parameters
    public static Collection<String[]> testConditionss() {

        String[][] tests = {
            {"ABCD","F"},
            {"ABAB","T"},
            {"AB","T"},
            {"A","F"}
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
     * Test of areFirstAndLastTwoCharactersTheSame method, of class StringHelper.
     */
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame() {
        System.out.println("areFirstAndLastTwoCharactersTheSame");
        if (testInputTrue) {
            assertTrue(instance.areFirstAndLastTwoCharactersTheSame(testInput));            
        } else {
            assertFalse(instance.areFirstAndLastTwoCharactersTheSame(testInput));            
        }
    }

}
