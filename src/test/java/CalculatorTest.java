import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd_ValidValues_ReturnsCorrectResult() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    public void testAdd_NegativeValues_ReturnsCorrectResult() {
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    public void testAdd_LargeValues_ReturnsCorrectResult() {
        assertEquals(Integer.MAX_VALUE, calculator.add(Integer.MAX_VALUE, 0));
        assertEquals(0, calculator.add(Integer.MAX_VALUE, -Integer.MAX_VALUE));
    }

    @Test
    public void testSubtract_ValidValues_ReturnsCorrectResult() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-1, calculator.subtract(-2, -1));
    }

    @Test
    public void testMultiply_ValidValues_ReturnsCorrectResult() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, 12345));
    }

    @Test
    public void testMultiply_NegativeValues_ReturnsCorrectResult() {
        assertEquals(6, calculator.multiply(-2, -3));
        assertEquals(-6, calculator.multiply(-2, 3));
    }

    @Test
    public void testDivide_ValidValues_ReturnsCorrectResult() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    public void testDivide_ByZero_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }

    @Test
    public void testDivide_LargeValue_ReturnsCorrectResult() {
        assertEquals(1, calculator.divide(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void testModulus_ValidValues_ReturnsCorrectResult() {
        assertEquals(1, calculator.modulus(7, 3));
    }

    @Test
    public void testModulus_InvalidValue_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.modulus(7, 0));
    }

    @Test
    public void testModulus_LargeValue_ReturnsCorrectResult() {
        assertEquals(0, calculator.modulus(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void testPower_ValidValues_ReturnsCorrectResult() {
        assertEquals(8.0, calculator.power(2, 3));
    }

    @Test
    public void testPower_NegativeExponent_ReturnsCorrectResult() {
        assertEquals(0.25, calculator.power(2, -2), 1e-6);
    }
}
