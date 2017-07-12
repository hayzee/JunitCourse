package com.in28minutes.junit.helper;

import java.io.FileNotFoundException;
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
public class StringHelperTest {

    // It's OK to put some setupcode in the class itself.
    // Maybe this should be in the setUpClass method.
   
    StringHelper instance = new StringHelper();

    public StringHelperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("@BeforeClass - setUpClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("@AfterClass - tearDownClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("@Before - setUp");
    }
    
    @After
    public void tearDown() {
        System.out.println("@After - tearDown");
    }

    /**
     * Test of truncateAInFirst2Positions method, of class StringHelper.
     */
    @Test
    public void testTruncateAInFirst2Positions() {

        System.out.println("truncateAInFirst2Positions");

        assertEquals("CD", instance.truncateAInFirst2Positions("AACD"));
        assertEquals("CD", instance.truncateAInFirst2Positions("ACD"));
        assertEquals("CDEF", instance.truncateAInFirst2Positions("CDEF"));
        assertEquals("CDAA", instance.truncateAInFirst2Positions("CDAA"));

        assertEquals("This is a string", instance.truncateAInFirst2Positions("AAThis is a string"));
        assertEquals("", instance.truncateAInFirst2Positions("AA"));
        assertEquals("", instance.truncateAInFirst2Positions("A"));
        assertEquals("", instance.truncateAInFirst2Positions(""));

        assertEquals("Fish and Chips", instance.truncateAInFirst2Positions("Fish and Chips"));

    }

    /**
     * Test of areFirstAndLastTwoCharactersTheSame method, of class StringHelper.
     */
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame() {
        
        System.out.println("areFirstAndLastTwoCharactersTheSame");
        assertFalse("Test ABCD",instance.areFirstAndLastTwoCharactersTheSame("ABCD"));
        assertTrue("Test ABAB",instance.areFirstAndLastTwoCharactersTheSame("ABAB"));
        assertTrue("Test AB",instance.areFirstAndLastTwoCharactersTheSame("AB"));
        assertFalse("Test A",instance.areFirstAndLastTwoCharactersTheSame("A"));
        
    }
    
}
