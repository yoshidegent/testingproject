package com.realdolmen.testingproject;

import java.util.LinkedList;
import java.util.Queue;

public class Printer
{
    private Queue<MyPrintJob> jobs = new LinkedList<MyPrintJob>();
    public void addToQueue(MyPrintJob job)
    {
        jobs.add(job);
    }

    public boolean startPrinting()
    {
        //TODO: to be implemented
        return true;
    }
}
