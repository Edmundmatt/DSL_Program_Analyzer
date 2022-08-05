import nz.ac.wgtn.ecs.swen438.assignment1.mayan.Task1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class Task1Test {

    @Test
    public void test0() {
        assertTrue(Task1.isValidMayanNumberExpression("0"));
    }

    @Test
    public void test1() {
        assertTrue(Task1.isValidMayanNumberExpression("*"));
    }
}
