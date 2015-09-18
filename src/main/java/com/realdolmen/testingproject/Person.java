package com.realdolmen.testingproject;

/**
 * Created by YDEAX41 on 18/09/2015.
 */
public class Person implements MyPrintJob {
    public String firstName, lastName;


    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean print(Printer printer, Document document){
        printer.addToQueue(this);
        return printer.startPrinting(document);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
