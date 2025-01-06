import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(7, calculator.add(4, 3), "4 + 3 should equal 7");
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(5, 3), "5 - 3 should equal 2");
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.multiply(5, 3), "5 * 3 should equal 15");
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.divide(9, 3), "9 / 3 should equal 3");
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0), "Dividing by zero should throw IllegalArgumentException");
    }

    @Test
    public void testModulus() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.modulus(10, 3), "10 % 3 should equal 1");
    }

    @Test
    public void testModulusByZero() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.modulus(10, 0), "Modulus by zero should throw IllegalArgumentException");
    }

    @Test
    public void testPowerPositive() {
        Calculator calculator = new Calculator();
        assertEquals(8.0, calculator.power(2, 3), "2^3 should equal 8");
    }

    @Test
    public void testPowerZeroExponent() {
        Calculator calculator = new Calculator();
        assertEquals(1.0, calculator.power(5, 0), "5^0 should equal 1");
    }

    @Test
    public void testPowerNegativeExponent() {
        Calculator calculator = new Calculator();
        assertEquals(0.125, calculator.power(2, -3), "2^-3 should equal 0.125");
    }
}
