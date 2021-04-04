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
public class AnaliseStringBF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String palavra = sc.nextLine();
        boolean m = metodo(palavra);
        if(m){
            System.out.println("Inicia e Termina");
        }
    }
    public static boolean metodo(String palavra){
        String duasI, duasF;
        duasI = palavra.substring(0, 2);
        System.out.println(duasI);
        duasF = palavra.substring(palavra.length() - 2);
        System.out.println(duasF);
        if(duasF.equals(duasI)) return true;
        else return false;
    }
}

