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

    public boolean startPrinting(Document document)
    {
        document.print();
        return true;
    }
}
