package com.ganesh.kasi.learning.spring.program;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created by ganeshkasi on 26/09/15.
 */
public class DisplayNameBeanPostProcessor implements BeanPostProcessor, BeanFactoryPostProcessor {

    public Object postProcessBeforeInitialization(Object object, String stringName) throws BeansException {
        System.out.println("Post Process Before Initialization " + stringName);
        return object;
    }

    public Object postProcessAfterInitialization(Object object, String stringName) throws BeansException {
        System.out.println("Post Process After Initialization " + stringName);
        return object;
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("Post Process Bean Factory Initialization " + configurableListableBeanFactory.toString());
    }
}
