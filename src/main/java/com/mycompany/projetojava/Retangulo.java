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
public class Retangulo extends Shape {
    private Double width;
    private Double height;
    
    public Retangulo(){
        super();
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Retangulo(Double width, Double height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        return width*height;
    }
    
}
