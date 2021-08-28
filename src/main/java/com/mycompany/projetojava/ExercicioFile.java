/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetojava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author lelo0
 */
public class ExercicioFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);
        File out = new File(path.getParent());
        out.mkdir();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            
            String[] line = br.readLine().split(",");
            while(line == null){
                int total = Integer.parseInt(line[1])*Integer.parseInt(line[2]);
                String proc = line[0] + "," + total;
            try(BufferedWriter bcr = new BufferedWriter(new FileWriter(out))){
                bcr.write(proc);
            }
            catch(IOException e){
                System.out.println("Error: " + e.getMessage());
            }
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
}
