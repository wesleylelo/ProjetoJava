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
public interface OnlinePaymentService {
    public Double paymentFree(Double amount);
    public Double interest(Double amount, Integer months);
}
