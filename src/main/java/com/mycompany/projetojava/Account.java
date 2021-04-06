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
public class Account {
    private Integer number;
    private String holder;
    private  Double balance;
    private Double withdrawLimit;

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public  void deposit (Double amount){
        balance += amount;
    }
    public void withdraw(Double amount){
        if(amount > withdrawLimit){
            throw new IllegalArgumentException("Withdraw error: The amount exceeds withdraw limit");
        }
        else if(amount > balance){
            throw new IllegalArgumentException("Withdraw error: Not enough balance");
        } 
        else{
            balance -= amount;
            System.out.println("New Balance: " + balance);
        }
        
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }
}
