package edu.umb.cs680.hw01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void multiply3And4() {
        Calculator calculator = new Calculator();
        float expected = 12;
        float actual = calculator.multiply(3, 4);
        assertEquals(actual, expected);
    }
    
    @Test
    public void multiplyMinus5AndMinus2() {
        Calculator calculator = new Calculator();
        float expected = 10;
        float actual = calculator.multiply(-5, -2);
        assertEquals(actual, expected);
    }
    
    @Test
    public void multiplyMinus5AndPositive2() {
        Calculator calculator = new Calculator();
        float expected = -10;
        float actual = calculator.multiply(-5, 2);
        assertEquals(actual, expected);
    }

    @Test
    public void divide4By2() {
        Calculator calculator = new Calculator();
        float expected = 2;
        float actual = calculator.divide(4, 2);
        assertEquals(actual, expected);
    }

    @Test
    public void divide5by0ExceptionThrown()  {
        Calculator calculator = new Calculator();
        try {
            calculator.divide(5,0);
            fail("Division by zero");
        } catch (IllegalArgumentException ex) {
            assertEquals("Division by zero",ex.getMessage());
          }
    }

    @Test
    public void test2Power4() {
        Calculator calculator = new Calculator();
        float expected = 16;
        float actual = calculator.power(2,4);
        assertEquals(expected,actual);
    }

    @Test
    public void test2Power0() {
        Calculator calculator = new Calculator();
        float expected = 1;
        float actual = calculator.power(2,0);
        assertEquals(expected,actual);
    }

    @Test
    public void testSquareRootOf4() {
        Calculator calculator = new Calculator();
        float expected = 2;
        float actual = calculator.squareRoot(4);
        assertEquals(expected,actual);
    }
    
    @Test
    public void test2PowerMinus4() {
        Calculator calculator = new Calculator();
        float expected = (float) 0.0625;
        float actual = calculator.power(2,-4);
        assertEquals(expected,actual);
    }
}

