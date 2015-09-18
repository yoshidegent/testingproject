package com.realdolmen.testingproject;

public class FormulaService {
    private int secondsElapsed = 0;

    private final int RUNTIME = 5;

    private Calculator calculator;

    public FormulaService(Calculator calculator) {
        this.calculator = calculator;
    }

    public FormulaService() {

    }

    //adds 5 seconds every call
    public void addTheTimeElapsed()
    {
        secondsElapsed = calculator.sum(secondsElapsed, RUNTIME);
    }

    public int secondsPassed()
    {
        return secondsElapsed;
    }

    public Integer numberOfRuns()
    {
        return calculator.divide(secondsElapsed, RUNTIME);
    }

    public void skipAhead(int skipCount)
    {
        this.secondsElapsed = calculator.sum(secondsElapsed, RUNTIME * skipCount);
    }

    public int getRUNTIME() {
        return RUNTIME;
    }
}
