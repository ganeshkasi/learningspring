package com.ganesh.kasi.learning.spring.program;

import org.jetbrains.annotations.NotNull;

/**
 * Created by ganeshkasi on 26/09/15.
 */
class GetterSetterInj {
    private int EmpID;
    private String name;

    @NotNull
    @Override
    public String toString() {
        return "GetterSetterInj{" + "name='" + name + '\'' + ", EmpID=" + EmpID + '}';
    }

    /*public String getName() {
        return name;
    }*/

    @NotNull
    public GetterSetterInj setName(String name) {
        this.name = name;
        return this;
    }

    /*public int getEmpID() {
        return EmpID;
    }*/

    @NotNull
    public GetterSetterInj setEmpID(int empID) {
        EmpID = empID;
        return this;
    }
}
