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
public class AnalisadorString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String palavra = sc.nextLine();
        String dentro = sc.nextLine();
        System.out.println(metodo(palavra, dentro));
    }
    public static String metodo(String palavra, String dentro){
        String nova;
        if(palavra.contains(dentro)){
            nova = palavra.replace(dentro, "");
            return nova;
        } else{
            return "Não contém";
        }
    }
}
