package com.realdolmen.testingproject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FooTest
{
    @InjectMocks
    private Foo foo = new Foo();

    private String myString1;

    @Mock
    private Bar bar;

    @Before
    public void before()
    {
        myString1 = "string 1";
    }

    @Test
    public void testDoFooSetsString1AndReurnsConcat()
    {
        String result = foo.doFoo(myString1);
        ArgumentCaptor<FooBar> fooBarArgumentCaptor = ArgumentCaptor.forClass(FooBar.class);
        Mockito.verify(bar).doBar(fooBarArgumentCaptor.capture());

        FooBar captured = fooBarArgumentCaptor.getValue();

        Assert.assertNotNull(captured);
        Assert.assertEquals(myString1, captured.string1);
        Assert.assertNotNull(result);
        Assert.assertEquals(myString1, result);
    }
}
