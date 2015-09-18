package com.realdolmen.testingproject;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by YDEAX41 on 18/09/2015.
 */
@RunWith(MockitoJUnitRunner.class)
public class FormulaServiceTest
{
    @InjectMocks
    private FormulaService formulaService = new FormulaService();

    @Mock
    private Calculator calculator;

    @After
    public void after()
    {
        formulaService = null;
    }

    @Test
    public void testSecondsPassed()
    {
        Assert.assertEquals(0, formulaService.secondsPassed());
    }

    @Test
    public void testAddTheTimeElapsed()
    {
        int elapsed = formulaService.secondsPassed();
        formulaService.addTheTimeElapsed();
        Mockito.verify(calculator).sum(elapsed, formulaService.getRUNTIME());
    }

    @Test
    public void testNumberOfRuns()
    {
        int elapsed = formulaService.secondsPassed();
        formulaService.numberOfRuns();
        Mockito.verify(calculator).divide(elapsed, formulaService.getRUNTIME());
    }

    @Test
    @Ignore
    public void testSkipAhead()
    {
        final int NUMBER_OF_RUNS = 10;

        int elapsed = formulaService.secondsPassed();
        formulaService.skipAhead(NUMBER_OF_RUNS);
        //Mockito.when(calculator.multiply()).thenReturn();

        Mockito.verify(calculator).multiply(NUMBER_OF_RUNS, formulaService.getRUNTIME());


        Mockito.verify(calculator).sum(elapsed, formulaService.getRUNTIME());

        //formulaService.numberOfRuns();
        //Mockito.verify(calculator).divide(elapsed, formulaService.getRUNTIME());
    }
}
