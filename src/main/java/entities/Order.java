/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import entities.enums.OrderStatus;
import java.util.Date;

/**
 *
 * @author lelo0
 */
public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus status;
    public Order(){
    }

    @Override
    public String toString() {
        return "Order {" + "id=" + id + ", moment=" + moment + ", status=" + status + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    
    public Order(Integer id, Date moment, OrderStatus status){
        this.id = id;
        this.moment = moment;
        this.status = status;
    }
}
