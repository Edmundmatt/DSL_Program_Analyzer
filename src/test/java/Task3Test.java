import nz.ac.wgtn.ecs.swen438.assignment1.mayan.Task3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task3Test {

    @Test
    public void doubleNegativeTest1() throws Exception {
        assertTrue(Task3.doesContainDoubleUnaryOperator("--*"));
    }


    @Test
    public void doubleNegativeTest2() throws Exception {
        assertTrue(Task3.doesContainDoubleUnaryOperator("-***--*|"));
    }

    @Test
    public void singleNegativeTest1() throws Exception {
        assertFalse(Task3.doesContainDoubleUnaryOperator("-*"));
    }

    @Test
    public void singleNegativeTest2() throws Exception {
        assertFalse(Task3.doesContainDoubleUnaryOperator("-(-*)-*"));
    }

}
