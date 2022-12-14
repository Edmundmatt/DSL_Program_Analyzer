import nz.ac.wgtn.ecs.swen438.assignment1.mayan.Task2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task2Test {

    @Test
    public void test1() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("*"), 1);
    }

    @Test
    public void test2() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("0"), 0);
    }

    @Test
    public void test3() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("**"), 2);
    }

    @Test
    public void test4() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("***"), 3);
    }

    @Test
    public void test5() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("|"), 5);
    }

    @Test
    public void test6() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("****|"), 9);
    }

    @Test
    public void test7() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("||"), 10);
    }

    @Test
    public void testAddition1() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("***+*"), 4);
    }

    @Test
    public void testAddition2() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("***+|"), 8);
    }

    @Test
    public void testAddition3() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("|+*"), 6);
    }

    @Test
    public void testSubtraction1() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("|-*"), 4);
    }

    @Test
    public void testSubtraction2() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("*-*"), 0);
    }

    @Test
    public void testSubtraction3() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("0-*"), -1);
    }

    @Test
    public void testSubtraction4() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("**-|"), -3);
    }

    @Test
    public void testNegative() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("-**|||"), -17);
    }

    @Test
    public void testDoubleNegative() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("--*"), 1);
    }

    @Test
    public void testBrackets1() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("(***+|||)-*"), 17);
    }

    @Test
    public void testBrackets2() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("(**+*_*)-|+(*+(*))"), 20);
    }


    @Test
    public void testUnderscore1() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("*_*"), 21);
    }

    @Test
    public void testUnderscore2() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("*_*||"), 31);
    }

    @Test
    public void testUnderscore3() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("**_||_*"), 1001);
    }

    @Test
    public void testUnderscore4() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("**_||_* + *"), 1002);
    }

    @Test
    public void testUnderscore5() throws Exception {
        assertEquals(Task2.evaluateMayanNumberExpression("*_0_*"), 401);
    }

    @Test
    public void testGiven1() throws Exception{
        assertEquals(Task2.evaluateMayanNumberExpression("**"), 2);
    }

    @Test
    public void testGiven2() throws Exception{
        assertEquals(Task2.evaluateMayanNumberExpression("*** + ***|| + ||"), 26);
    }

    @Test
    public void testGiven3() throws Exception{
        assertEquals(Task2.evaluateMayanNumberExpression("-*** + (***|| - ||)"), 0);
    }

    @Test
    public void testTripleNegative() throws Exception{
        assertEquals(Task2.evaluateMayanNumberExpression("---*"), -1);
    }
}
