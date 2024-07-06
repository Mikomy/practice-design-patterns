package org.example.singletonPattern;

public class PrintSpooler {

    private PrintSpooler() {}

    private static PrintSpooler INSTANCE;

    public static PrintSpooler getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PrintSpooler();
        }
        return INSTANCE;
    }
    void print() {
        System.out.println("Printing");
    }


}

