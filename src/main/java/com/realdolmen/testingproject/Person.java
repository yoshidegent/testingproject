package com.realdolmen.testingproject;

/**
 * Created by YDEAX41 on 18/09/2015.
 */
public class Person implements MyPrintJob {
    public final String firstName, lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean print(Printer printer, Document document){
        printer.addToQueue(this);
        return printer.startPrinting(document);
    }
}
