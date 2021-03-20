/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetojava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lelo0
 */
public class ProgramEmployment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mnumber of employees: ");
        List<Employee> list = new ArrayList<>();
        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if(ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(additionalCharge,name, hours, valuePerHour);
                list.add(emp);
            }
            else {
                list.add(new Employee(name, hours, valuePerHour));
                
            }
        }   
        System.out.println();
        System.out.println("PAYMENTS: ");
     for (Employee emp : list){
         System.out.println(emp.getName() + " - $ " + String.format("%.2f",emp.payment()));
     }
    
}
    
}
