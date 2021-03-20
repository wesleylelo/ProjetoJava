/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetojava;

/**
 *
 * @author lelo0
 */
public class OutsourcedEmployee extends Employee {
    private Double additionalCharge;
    @Override
    public Double payment(){
        return (getValuePerhour()*getHours()+ 1.1*additionalCharge);
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public OutsourcedEmployee(Double additionalCharge, String name, Integer hours, Double valuePerhour) {
        super(name, hours, valuePerhour);
        this.additionalCharge = additionalCharge;
    }
}
