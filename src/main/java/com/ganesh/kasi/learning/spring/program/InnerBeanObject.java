package com.ganesh.kasi.learning.spring.program;

/**
 * Created by ganeshkasi on 26/09/15.
 */
public class InnerBeanObject {

    private ConstructorInj constructorInj;

    @Override
    public String toString() {
        return "InnerBeanObject{" + "constructorInj=" + constructorInj + '}';
    }

    public InnerBeanObject setConstructorInj(ConstructorInj constructorInj) {
        this.constructorInj = constructorInj;
        return this;
    }


}
