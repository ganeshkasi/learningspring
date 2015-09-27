package com.ganesh.kasi.learning.spring.program;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by ganeshkasi on 26/09/15.
 */
public class SpringBeanInheritance {
    private PrintMsg message_001;

    @Autowired
    @Qualifier("printMsg_002BeanID")
    private PrintMsg message_002;

    private PrintMsg message_003;

    @Override
    public String toString() {
        return "SpringBeanInheritance{ \n" + "message_001 = " + message_001 + "\n" + "message_002 = " + message_002 + "\n" + "message_003 = " + message_003 + "\n" + '}';
    }

    /*public PrintMsg getMessage_001() {
        return message_001;
    }*/

    @Required
    public SpringBeanInheritance setMessage_001(PrintMsg message_001) {
        this.message_001 = message_001;
        return this;
    }

    /*public PrintMsg getMessage_002() {
        return message_002;
    }*/


    public SpringBeanInheritance setMessage_002(PrintMsg message_002) {
        this.message_002 = message_002;
        return this;
    }

    /*public PrintMsg getMessage_003() {
        return message_003;
    }*/

    @Required
    public SpringBeanInheritance setMessage_003(PrintMsg message_003) {
        this.message_003 = message_003;
        return this;
    }


}
