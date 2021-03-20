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
public class Employee {
    private String name;
    private Integer hours;
    private Double valuePerhour;
    
    public Employee(){
        
    }
    public Employee(String name, Integer hours, Double valuePerhour) {
        this.name = name;
        this.hours = hours;
        this.valuePerhour = valuePerhour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerhour() {
        return valuePerhour;
    }

    public void setValuePerhour(Double valuePerhour) {
        this.valuePerhour = valuePerhour;
    }
    
    
    public Double payment(){
        return hours*valuePerhour;
    }
}
