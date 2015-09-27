package com.ganesh.kasi.learning.spring.program;

/**
 * Created by ganeshkasi on 24/09/15.
 */
class PrintMsg {
    private String welcomeMessage;

    @Override
    public String toString() {
        return "PrintMsg{" + "welcomeMessage='" + welcomeMessage + '\'' + '}';
    }

    private String getWelcomeMessage() {
        return welcomeMessage;
    }

    public PrintMsg setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
        return this;
    }

    public void printmsgMethod() {
        System.out.println(getWelcomeMessage());
    }
}
