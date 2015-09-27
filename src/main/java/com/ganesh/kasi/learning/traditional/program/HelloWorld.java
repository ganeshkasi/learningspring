package com.ganesh.kasi.learning.traditional.program;

import org.jetbrains.annotations.NotNull;

/**
 * Created by ganeshkasi on 24/09/15.
 */
class PrintMsg {
    public void printMsg() {
        System.out.println("HelloWorld!");
    }
}

class HelloWorld {
    public static void main(String[] args) {
        @NotNull PrintMsg printMsg = new PrintMsg(); // new keyword creates and allocates memory. tightly coupled
        printMsg.printMsg();
    }
}
