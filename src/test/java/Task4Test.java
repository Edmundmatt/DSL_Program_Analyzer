import nz.ac.wgtn.ecs.swen438.assignment1.mayan.Task4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task4Test {

    @Test
    public void doubleBracketTest1() throws Exception {
        assertTrue(Task4.doesContainDoubleBracket("((*))"));
    }
}
