package com.realdolmen.testingproject;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PersonTest
{
    private Person person;

    @Mock
    private Printer printerMock;

    @Mock
    private Document documentMock;

    @Before
    public void before()
    {
        person = new Person("Yoshi", "Degent");
        //printerMock = Mockito.mock(Printer.class);
    }

    @Test
    public void testPrint()
    {
        Mockito.when(printerMock.startPrinting(documentMock)).thenReturn(true);
        Assert.assertTrue(person.print(printerMock, documentMock));
        Mockito.verify(printerMock).startPrinting(documentMock);
        Mockito.verify(printerMock, Mockito.times(1)).startPrinting(documentMock);
        Mockito.verify(printerMock, Mockito.atLeastOnce()).startPrinting(documentMock);
    }

    @Test(expected=IllegalStateException.class)
    public void testPrintWithThrow()
    {
        Mockito.when(printerMock.startPrinting(documentMock)).thenThrow(new IllegalStateException());
        Assert.assertTrue(person.print(printerMock, documentMock));
    }
}
