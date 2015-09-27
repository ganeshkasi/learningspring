package com.ganesh.kasi.learning.spring.program;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

/**
 * Created by ganeshkasi on 26/09/15.
 */
public class SpringBeanInheritanceListMerge implements InitializingBean, DisposableBean {
    private List<PrintMsg> message_004;

    public SpringBeanInheritanceListMerge setMessage_004(List<PrintMsg> message_004) {
        this.message_004 = message_004;
        return this;
    }

    @Override
    public String toString() {
        return "SpringBeanInheritanceListMerge{" + "message_004=" + message_004 + '}';
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean afterPropertiesSet");
    }

    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy");
    }

    public void userDefinedinit() {
        System.out.println("InitializingBean userDefinedinit");
    }

    public void userDefinedDestroy() {
        System.out.println("InitializingBean userDefinedinit");
    }
}
