package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void testOneBracketLeft(){
        String oneBracketLeft = "[";
        assertFalse(BalancedBrackets.hasBalancedBrackets(oneBracketLeft));
    }
    @Test
    public void testStringEndsWithClosedBracket(){
        String oneBracketRight = "]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(oneBracketRight));
    }
    @Test
    public void testEmptyString(){
        String emptyString = "";
        assertTrue(BalancedBrackets.hasBalancedBrackets(emptyString));
    }
    @Test
    public void testOpposingBrackets(){
        String opposingBrackets = "][";
        assertFalse(BalancedBrackets.hasBalancedBrackets(opposingBrackets));
    }
    @Test
    public void testMultipleCloseBrackets(){
        String multipleBrackets = "[]]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(multipleBrackets));
    }
    @Test
    public void testMultipleOpenBrackets(){
        String multipleBrackets = "[[]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(multipleBrackets));
    }
}
