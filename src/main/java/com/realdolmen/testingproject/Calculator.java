package com.realdolmen.testingproject;

/**
 * Created by YDEAX41 on 18/09/2015.
 */
public class Calculator
{

    public int sum(int a, int b)
    {
        return a + b;
    }

    public int multiply(int a, int b)
    {
        return a * b;
    }

    public Integer divide(int a, int b)
    {
        if(b != 0) {
            return a / b;
        }
        else
            return null;
    }

    public Double squareRoot(double a)
    {
        if(a < 0)
        {
            return null;
        }
        return Math.sqrt(a);
    }
}
