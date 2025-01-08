# BÀI TẬP 1: KIỂM THỬ CÁC PHÉP TOÁN SỐ HỌC BẰNG JAVA
## Lớp Calculator cung cấp các phương thức tính toán cơ bản
```java
public class Calculator {
    // Phương thức cộng hai số
    public int add(int a, int b) {
        return a + b;
    }
    // Phương thức trừ hai số
    public int subtract(int a, int b) {
        return a - b;
    }
    // Phương thức nhân hai số
    public int multiply(int a, int b) {
        return a * b;
    }
    // Phương thức chia hai số (ném ra ngoại lệ nếu chia cho 0)
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return a / b;
    }
    // Phương thức tính phần dư (ném ra ngoại lệ nếu chia cho 0)
    public int modulus(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return a % b;
    }
    // Phương thức tính lũy thừa
    public double power(int a, int b) {
        return Math.pow(a, b);
    }
}
```

## Lớp kiểm thử cho Calculator
```java
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

```
## Hình ảnh minh họa
![Screenshot 2025-01-06 112109](https://github.com/user-attachments/assets/86975801-76b8-4e26-b398-4a13d7123705)
## Nguồn tham khảo
https://chatgpt.com/share/677e0726-e120-800a-95fb-afc55633bfbb

## Author
[Nguyễn Thị Xuân - BIT220184]
