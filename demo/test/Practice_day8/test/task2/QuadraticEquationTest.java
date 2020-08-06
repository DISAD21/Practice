package Practice_day8.test.task2;

import com.sbrf.Practice_day8.QuadraticEquation;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadraticEquationTest {
    @Test
    public void testQuadraticEquationOneRoot() {
        QuadraticEquation result = new QuadraticEquation();
        List<Double> Check = new ArrayList<>();
        Check.add(-2.0);
        assertEquals(Check, result.quadraticEquation(1,4,4));
    }
    @Test
    public void testQuadraticEquationTwoRoot() {
        QuadraticEquation result = new QuadraticEquation();
        List<Double> Check = new ArrayList<>();
        Check.add(-0.06256115465737722);
        Check.add(-63.937438845342626);
        assertEquals(Check, result.quadraticEquation(1,64,4));
    }
    @Test
    public void testQuadraticEquationNoRoot() {
        QuadraticEquation result = new QuadraticEquation();
        List<Double> Check = new ArrayList<>();
        assertEquals(Check, result.quadraticEquation(1,2,3));
    }
    @Test
    public void testQuadraticEquationNaNRoot() {
        QuadraticEquation result = new QuadraticEquation();
        List<Double> Check = new ArrayList<>();
        assertEquals(Check, result.quadraticEquation(0,0,0));
    }
    @Test
    public void testQuadraticEquationNanInfRoot() {
        QuadraticEquation result = new QuadraticEquation();
        List<Double> Check = new ArrayList<>();
        assertEquals(Check, result.quadraticEquation(0,12,2));
    }
}
