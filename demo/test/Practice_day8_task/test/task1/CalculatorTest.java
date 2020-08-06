package Practice_day8_task.test.task1;

import com.sbrf.Practice_day8.Calculator;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(2, 2);
        assertEquals( 4, result);
    }
    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int result = calculator.sub(2, 2);
        assertEquals( 0, result);
    }
    @Test
    public void testDiv() {
        Calculator calculator = new Calculator();
        int result = calculator.div(6, 3);
        assertEquals( 0, result);
    }
    @Test
    public void testDivByZero() throws IOException {
        Calculator calculator = new Calculator();
        Throwable thrown = assertThrows(ArithmeticException.class, () -> {
            calculator.div(6, 0);
        });
    }
    @Test
    public void testMul() {
        Calculator calculator = new Calculator();
        int result = calculator.mul(6, 3);
        assertEquals( 18, result);
    }
}


