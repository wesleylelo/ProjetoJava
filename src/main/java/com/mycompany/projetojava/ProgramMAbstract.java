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
public class ProgramMAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of shapes: ");
        List<Shape> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 1; i <= n ; i++){
            System.out.println("Shape #" + i + "data:");
          System.out.println("Rectangle or Circle (r/c)?");
          char ch = sc.next().charAt(0);
          System.out.println("Color (BLACK/BLUE/RED): ");
          Color color = Color.valueOf(sc.next());
          
          if(ch == 'r'){
              System.out.println("Width: ");
              double width = sc.nextDouble();
              System.out.println("Height: ");
              double height = sc.nextDouble();
              list.add(new Retangulo(width, height, color));
          } else{
              System.out.println("Radius: ");
              double radius = sc.nextDouble();
              list.add(new Circle(radius, color));
          }
        }
        System.out.println("");
        System.out.println("SHAPE AREAS: ");
        for (Shape shape: list){
            System.out.println(String.format("%.2f", shape.area()));
        }
        sc.close();
    }
    
}
