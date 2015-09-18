package com.realdolmen.testingproject;

import java.util.List;

/**
 * Created by YDEAX41 on 18/09/2015.
 */
public class Family {
    private Person father;
    private Person mother;
    private List<Person> children;

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public void setMomsName(String firstName)
    {
        mother.setFirstName(firstName);
    }

    public void setDadsName(String firstName)
    {
        father.setFirstName(firstName);
    }

    public void setFamilyLastName(String lastName)
    {
        this.father.setLastName(lastName);
        this.mother.setLastName(lastName);
        for(Person child : getChildren())
        {
            child.setLastName(lastName);
        }
    }

    public void setChildrensNames(String... firstNames)
    {
        for(int i=0; i<getChildren().size(); i++)
        {
            children.get(i).setFirstName(firstNames[i]);
        }
    }
}
