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
public class Account {
    private Integer number;
    private String holder;
    protected Double balance;
    public Account(){
        
    }
    public Account(Integer number, String holder, Double balance){
        this.holder = holder;
        this.number = number;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount){
        balance -= amount + 5.0;
    }
    public void deposit(double amount){
        balance += amount;
    }
}
