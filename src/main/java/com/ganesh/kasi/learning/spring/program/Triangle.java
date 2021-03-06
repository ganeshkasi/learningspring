package com.ganesh.kasi.learning.spring.program;

import org.springframework.beans.factory.BeanNameAware;

/**
 * Created by ganeshkasi on 27/09/15.
 */
public class Triangle implements Shape, BeanNameAware {

    private int value;

    private String beanName;

    private int getValue() {
        return value;
    }

    public Triangle setValue(int value) {
        this.value = value;
        return this;
    }

    public void draw() {
        System.out.println(getBeanName() + " = " + getValue());
    }

    private String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

}
