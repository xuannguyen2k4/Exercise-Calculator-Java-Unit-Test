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
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    @DisplayName("Test addition: 2 + 3 = 5")
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    @DisplayName("Test subtraction: 5 - 3 = 2")
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(5, 3), "5 - 3 should equal 2");
    }

    @Test
    @DisplayName("Test multiplication: 4 * 3 = 12")
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.multiply(4, 3), "4 * 3 should equal 12");
    }

    @Test
    @DisplayName("Test division: 10 / 2 = 5")
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.divide(10, 2), "10 / 2 should equal 5");
    }

    @Test
    @DisplayName("Test division by zero throws exception")
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0), "Dividing by zero should throw IllegalArgumentException");
    }

    @Test
    @DisplayName("Test modulus: 10 % 3 = 1")
    public void testModulus() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.modulus(10, 3), "10 % 3 should equal 1");
    }

    @Test
    @DisplayName("Test modulus by zero throws exception")
    public void testModulusByZero() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.modulus(10, 0), "Modulus by zero should throw IllegalArgumentException");
    }

    @Test
    @DisplayName("Test power: 2^3 = 8")
    public void testPowerPositive() {
        Calculator calculator = new Calculator();
        assertEquals(8.0, calculator.power(2, 3), "2^3 should equal 8");
    }

    @Test
    @DisplayName("Test power with zero exponent: 5^0 = 1")
    public void testPowerZeroExponent() {
        Calculator calculator = new Calculator();
        assertEquals(1.0, calculator.power(5, 0), "5^0 should equal 1");
    }

    @Test
    @DisplayName("Test power with negative exponent: 2^-3 = 0.125")
    public void testPowerNegativeExponent() {
        Calculator calculator = new Calculator();
        assertEquals(0.125, calculator.power(2, -3), "2^-3 should equal 0.125");
    }
}
```
## Hình ảnh minh họa
![Screenshot 2025-01-06 112109](https://github.com/user-attachments/assets/86975801-76b8-4e26-b398-4a13d7123705)
## Nguồn tham khảo
https://chatgpt.com/share/677b5cb6-6790-800a-87c0-4444ed6cd257

## Author
[Nguyễn Thị Xuân]
