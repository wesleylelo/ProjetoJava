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
public class BusinessAccount extends Account {
    private Double loanLimit;
    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Double loanLimit, Integer number, String holder, Double balance) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    @Override
    public void withdraw(double amount){
        balance -= amount;
    }
    public void loan(double amount){
        if(amount <= loanLimit)
            deposit(amount);
    }
    
}
