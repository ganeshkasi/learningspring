package com.ganesh.kasi.learning.spring.program;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ganeshkasi on 24/09/15.
 */
class PrintMsg {
    public void printmsgMethod() {
        System.out.println("HelloWorld!");
    }
}

public class HelloWorldSpring {
    public static void main(String[] args) {
        /*ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml"); // xml file should be kept root folder */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); // xml file should be kept in resources folder ie: src/main/resources
        PrintMsg printMsg = (PrintMsg) context.getBean("printMsgBeanID");
        printMsg.printmsgMethod();
    }
}
