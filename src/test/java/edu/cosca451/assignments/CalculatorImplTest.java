package edu.cosca451.assignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

public class CalculatorImplTest {

    private static Calculator calculator;

    @BeforeAll
    public static void setUp() {
        calculator = new CalculatorImpl();
    }

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, calculator.subtract(2, 3));
        assertEquals(-3, calculator.subtract(-2, 1));
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-2, calculator.multiply(-2, 1));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    public void testDivideByZero() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
        assertInstanceOf(ArithmeticException.class, exception);
    }
}
