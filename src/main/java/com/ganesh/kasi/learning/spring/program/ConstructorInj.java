package com.ganesh.kasi.learning.spring.program;

import org.jetbrains.annotations.NotNull;

/**
 * Created by ganeshkasi on 26/09/15.
 */
public class ConstructorInj {
    private final int EmpID;
    private final String name;

    public ConstructorInj(String name, int EmpID) {
        this.EmpID = EmpID;
        this.name = name;
    }

    /*public ConstructorInj setEmpID(int empID) {
        EmpID = empID;
        return this;
    }*/

    /*public ConstructorInj setName(String name) {
        this.name = name;
        return this;
    }*/

    @NotNull
    @Override
    public String toString() {
        return "ConstructorInj{" + "EmpID=" + EmpID + ", name='" + name + '\'' + '}';
    }
}
