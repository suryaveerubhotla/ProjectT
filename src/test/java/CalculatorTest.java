import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(8, BackEnd.add(5, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, BackEnd.subtract(7, 2));
    }

    @Test
    public void testMultiplication() {
        assertEquals(24, BackEnd.multiply(4, 6));
    }

    @Test
    public void testDivision() {
        assertEquals(5, BackEnd.divide(10, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        BackEnd.divide(8, 0);
    }
}
