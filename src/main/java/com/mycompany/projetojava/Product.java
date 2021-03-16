/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author lelo0
 */
public class Product {
    private String produto;
    private Double price;
    public Product(){
    }
    public Product(String produto, Double price) {
        this.produto = produto;
        this.price = price;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Double getQuantity() {
        return price;
    }

    public void setQuantity(Double price) {
        this.price = price;
    }
    
}
