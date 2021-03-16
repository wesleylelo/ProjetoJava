/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lelo0
 */
public class Order {
    private Date moment;
    OrderStatus status;
    private List<Orderitem> orderitem = new ArrayList<>();
    private Client client;
    public Order(){
        
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<Orderitem> getOrderitem() {
        return orderitem;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    public void addItem(Orderitem orderitem){
        this.orderitem.add(orderitem);
    }
    public void removeItem(Orderitem orderitem){
        this.orderitem.remove(orderitem);
    }
    
    public Double total(){
        Double total = 0.0;
        for(Orderitem c: orderitem){
            total += c.subTotal();
        }
        return total;
    }
    
}
