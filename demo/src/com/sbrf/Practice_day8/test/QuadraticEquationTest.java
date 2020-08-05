package com.sbrf.Practice_day8.test;

import com.sbrf.Practice_day8.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadraticEquationTest {
    @Test
    public void testQuadraticEquationOneRoot() {
        QuadraticEquation calculator = new QuadraticEquation();
        assertEquals( "-2.0", calculator.quadraticEquation(1, 4, 4));
    }
    @Test
    public void testQuadraticEquationTwoRoot() {
        QuadraticEquation calculator = new QuadraticEquation();
        assertEquals("-0.06256115465737722 -63.937438845342626", calculator.quadraticEquation(1, 64, 4));
    }
    @Test
    public void testQuadraticEquationNoRoot() {
        QuadraticEquation calculator = new QuadraticEquation();
        assertEquals("Уравнение не имеет квадратных корней", calculator.quadraticEquation(1, 2, 3));
    }
    @Test
    public void testQuadraticEquationNaNRoot() {
        QuadraticEquation calculator = new QuadraticEquation();
        assertEquals("Уравнения нет", calculator.quadraticEquation(0, 0, 0));
    }
    @Test
    public void testQuadraticEquationNanInfRoot() {
        QuadraticEquation calculator = new QuadraticEquation();
        assertEquals("Уравнения нет", calculator.quadraticEquation(0, 12, 2));
    }
}
