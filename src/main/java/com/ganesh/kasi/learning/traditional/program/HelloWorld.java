package com.ganesh.kasi.learning.traditional.program;

/**
 * Created by ganeshkasi on 24/09/15.
 */
class PrintMsg {
    public void printMsg() {
        System.out.println("HelloWorld!");
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        PrintMsg printMsg = new PrintMsg(); // new keyword creates and allocates memory. tightly coupled
        printMsg.printMsg();
    }
}
