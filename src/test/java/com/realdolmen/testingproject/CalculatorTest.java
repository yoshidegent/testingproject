package com.realdolmen.testingproject;

import org.junit.*;

/**
 * Created by YDEAX41 on 18/09/2015.
 */
public class CalculatorTest
{
    private static Calculator calculator;
    private int a;
    private int b;

    @BeforeClass
    public static void before()
    {
        calculator = new Calculator();
    }

    @Test
    public void testSum()
    {
        a = 2;
        b = -3;
        int result = calculator.sum(a, b);
        Assert.assertEquals(a + b, result);

        a = 0;
        b = -1093038;
        result = calculator.sum(a, b);
        Assert.assertEquals(a + b, result);

        a = -6;
        b = -3;
        result = calculator.sum(a, b);
        Assert.assertEquals(a + b, result);
    }


    @Test
    public void testMultiply()
    {
        a = -6;
        b = -3;
        int result = calculator.multiply(a, b);
        Assert.assertEquals(a * b, result);

        a = -6;
        b = 18;
        result = calculator.multiply(a, b);
        Assert.assertEquals(a * b, result);

        a = 1;
        b = 3930393;
        result = calculator.multiply(a, b);
        Assert.assertEquals(a * b, result);

        a = 0;
        b = 3930393;
        result = calculator.multiply(a, b);
        Assert.assertEquals(a * b, result);
    }

    @Test
    public void testDivide()
    {
        a = 8;
        b = 2;
        int result = calculator.divide(a, b);
        Assert.assertEquals(a / b, result);

        a = 8;
        b = -2;
        result = calculator.divide(a, b);
        Assert.assertEquals(a / b, result);
    }

    @Test
    public void testDivideByZero()
    {
        a = 20;
        b = 0;
        Integer result = calculator.divide(a, b);
        Assert.assertNull(result);
    }

    @Test
    public void testSquareRoot()
    {
        final double DELTA = 1e-15;
        a = 0;
        double result = calculator.squareRoot(a);
        Assert.assertEquals(Math.sqrt(a), result, DELTA);

        a = 1;
        result = calculator.squareRoot(a);
        Assert.assertEquals(Math.sqrt(a), result, DELTA);

        a = 25;
        result = calculator.squareRoot(a);
        Assert.assertEquals(Math.sqrt(a), result, DELTA);

        a = 1544646;
        result = calculator.squareRoot(a);
        Assert.assertEquals(Math.sqrt(a), result, DELTA);
    }

    @Test
    public void testSquareRootWithNegativeNumber()
    {
        a = -26665;
        Double result = calculator.squareRoot(a);
        Assert.assertNull(result);
    }
}
