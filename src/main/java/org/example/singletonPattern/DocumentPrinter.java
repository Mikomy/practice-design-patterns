package org.example.singletonPattern;

public class DocumentPrinter {

    public void printDocument() {
        var spooler = PrintSpooler.getInstance();
        spooler.print();

    }
}