package com.realdolmen.testingproject;

import org.junit.*;
import org.mockito.Mock;
import org.mockito.Mockito;

/**
 * Created by YDEAX41 on 18/09/2015.
 */
public class PersonTest
{
    private Person person;

    @Mock
    private Printer printerMock;

    @Before
    public void before()
    {
        person = new Person("Yoshi", "Degent");
        printerMock = Mockito.mock(Printer.class);
    }

    @Test
    public void testPrint()
    {
        Mockito.when(printerMock.startPrinting()).thenReturn(true);
        Assert.assertTrue(person.print(printerMock));
    }
}
