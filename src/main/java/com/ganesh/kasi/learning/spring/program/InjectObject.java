package com.ganesh.kasi.learning.spring.program;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by ganeshkasi on 26/09/15.
 */
public class InjectObject implements ApplicationContextAware, BeanNameAware {

    private ConstructorInj constructorInj;

    @Override
    public String toString() {
        return "InjectObject{" + "constructorInj=" + constructorInj + '}';
    }

    public InjectObject setConstructorInj(ConstructorInj constructorInj) {
        this.constructorInj = constructorInj;
        return this;
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContext context = applicationContext;
    }

    public void setBeanName(String beanName) {
        System.out.println("Bean name : " + beanName);
    }
}
