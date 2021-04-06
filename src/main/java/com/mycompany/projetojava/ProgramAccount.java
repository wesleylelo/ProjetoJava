/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetojava;

import java.util.Scanner;

/**
 *
 * @author lelo0
 */
public class ProgramAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter account data");
        System.out.println("Number: ");
        Integer number = sc.nextInt();
        sc.nextLine();
        System.out.println("Holder: ");
        String holder =  sc.nextLine();
        System.out.println("Initial Balance: ");
        Double balance = sc.nextDouble();
        System.out.println("Withdraw Limit: ");
        Double withdraw = sc.nextDouble();
        Account account = new Account(number, holder, balance, withdraw);
        System.out.println("Enter amount for withdraw: ");
        Double Amountwithdraw = sc.nextDouble();
        account.withdraw(Amountwithdraw);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    
}
