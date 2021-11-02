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
public class PaypalService implements OnlinePaymentService{

    @Override
    public Double paymentFree(Double amount) {
        return amount*0.02;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return amount*0.01;
    }

    public PaypalService() {
    }
    
}
