package com.realdolmen.testingproject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FamilyTest {

    private String name;
    private List<Person> children;

    @InjectMocks
    private Family family;

    @Mock (name= "mother")
    private Person mother;

    @Mock (name = "father")
    private Person father;

    @Mock
    private Person child1;

    @Mock
    private Person child2;


    @Before
    public void init() {
        name = "this is a new name";
        children = new ArrayList<Person>();
        children.add(child1);
        children.add(child2);
        family.setChildren(children);
    }


    @Test
    public void testToSetMomsName()    {
        family.setMomsName(name);
        verify(mother).setFirstName(name);
    }

    @Test
    public void testToSetDadsName() {
        family.setDadsName(name);
        verify(father).setFirstName(name);
    }

    @Test
    public void testSetChildrensNames()   {
        family.setChildrensNames(name, name);
        verify(child1).setFirstName(name);
        verify(child2).setFirstName(name);
    }

    @Test
    public void testSetFamilyLastName() {
        family.setFamilyLastName(name);
        verify(father).setLastName(name);
        verify(mother).setLastName(name);
        verify(child1).setLastName(name);
        verify(child2).setLastName(name);
    }
}
