/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lelo0
 */
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cliente data");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Virth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        Client client  = new Client(name, email, birthDate);
        System.out.println("Enter order data");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        Order order = new Order(new Date(), status,client);
        System.out.println("How many items to this order: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Enter #" + i + " item data:");
            System.out.println("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            double productPrice = sc.nextInt();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            Product product = new Product(productName, productPrice);
            Orderitem it = new Orderitem(quantity, productPrice, product);
            order.addItem(it);
        }
        System.out.println(order);
    }
    
}
