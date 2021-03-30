/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetojava;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lelo0
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();
        System.out.println(vect[position]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Position!");
        }
        catch(InputMismatchException e){
            System.out.println("Input error");
        }
        
        
    }
    
}
