import nz.ac.wgtn.ecs.swen438.assignment1.mayan.Task1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Task1Test {

    private String[] validDigits = {"0", "*", "**", "***", "****", "|",
        "*|", "**|", "***|", "****|", "||", "*||", "**||", "***||",
        "****||", "|||", "*|||", "**|||", "***|||", "****|||"};

    @Test
    public void test0() {
        assertTrue(Task1.isValidMayanNumberExpression("0"));
    }

    @Test
    public void test1() {
        assertTrue(Task1.isValidMayanNumberExpression("*"));
    }

    @Test
    public void test2() {
        assertTrue(Task1.isValidMayanNumberExpression("**"));
    }

    @Test
    public void testNegative1() {
        assertTrue(Task1.isValidMayanNumberExpression("-*"));
    }

    @Test
    public void testDigits() {
        for (String digit: validDigits) {
            assertTrue(Task1.isValidMayanNumberExpression(digit));
        }
    }

    @Test
    public void testFail1() {
        assertFalse(Task1.isValidMayanNumberExpression("*****"));
    }

    @Test
    public void testFail2() {
        assertFalse(Task1.isValidMayanNumberExpression("*0"));
    }

    @Test
    public void testFail3() {
        assertFalse(Task1.isValidMayanNumberExpression(" "));
    }

    @Test
    public void testFail4() {
        assertFalse(Task1.isValidMayanNumberExpression("_"));
    }

    @Test
    public void testUnderscore1() {
        assertTrue(Task1.isValidMayanNumberExpression("*_|")); //25
    }

    @Test
    public void testUnderscore2() {
        assertTrue(Task1.isValidMayanNumberExpression("*_0_*"));
    }
}
