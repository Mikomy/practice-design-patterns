package org.example.singletonPattern;

public class ImagePrinter {

    public void printImage() {
       var spooler = PrintSpooler.getInstance();
       spooler.print();

    }
}
