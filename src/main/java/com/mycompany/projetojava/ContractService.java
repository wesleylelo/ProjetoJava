/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetojava;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author lelo0
 */
public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    public void processContract(Contract contract, Integer months){
       double parcela = contract.getTotalValue()/months;
       for(int i = 1; i <= months; i++){
           double nova = parcela + onlinePaymentService.interest(parcela, i);
           nova = nova + onlinePaymentService.paymentFree(nova);
           contract.getInstallments().add(new Installment(calendario(contract.getDate(), i), nova));
       }
    }
    public Date calendario(Date date, Integer N){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, N);
        return calendar.getTime();
    }
}
