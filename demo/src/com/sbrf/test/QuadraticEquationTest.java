package com.sbrf.test;

import com.sbrf.Practice_day8.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadraticEquationTest {
    @Test
    public void testQuadraticEquationOneRoot() {
        QuadraticEquation calculator = new QuadraticEquation();
        String result = calculator.quadraticEquation(1, 4, 4);
        assertEquals( "-2.0", result, "0.0001");
    }
    @Test
    public void testQuadraticEquationTwoRoot() {
        QuadraticEquation calculator = new QuadraticEquation();
        String result = calculator.quadraticEquation(1, 64, 4);
        assertEquals("-0.06256115465737722 -63.937438845342626", result, "0.0001");
    }
    @Test
    public void testQuadraticEquationNoRoot() {
        QuadraticEquation calculator = new QuadraticEquation();
        String result = calculator.quadraticEquation(1, 2, 3);
        assertEquals( "Уравнение не имеет квадратных корней", result);

    }
    @Test
    public void testQuadraticEquationNaNRoot() {
        QuadraticEquation calculator = new QuadraticEquation();
        String result = calculator.quadraticEquation(0, 0, 0);
        assertEquals( "Уравнения нет", result);
    }
    @Test
    public void testQuadraticEquationNanInfRoot() {
        QuadraticEquation calculator = new QuadraticEquation();
        String result = calculator.quadraticEquation(0, 12, 2);
        assertEquals( "Уравнения нет", result);
    }
}
