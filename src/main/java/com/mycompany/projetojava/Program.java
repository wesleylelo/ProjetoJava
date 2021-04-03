/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetojava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lelo0
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        System.out.println("Room number: ");
        int number = sc.nextInt();
        System.out.println("Check-in date (dd/MM/yyy)");
        Date checkIn = sdf.parse(sc.next());
        System.out.println("Check-out date (dd/MM/yyy)");
        Date checkOut = sdf.parse(sc.next());
        if(!checkOut.after(checkIn)){
            System.out.println("Error in reservation: Check-out datemust be after check-in date");
        } else{
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.println("Check-in date (dd/MM/yyy)");
            checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyy)");
            checkOut = sdf.parse(sc.next());
            Date now = new Date();
            if(checkIn.before(now) || checkOut.before(now)){
                System.out.println("Error in reservation: Reservation dates for update must be future");
            }
            else if(!checkOut.after(checkIn)){
                System.out.println("Error in reservation: Reservation dates for update must be future");
            } else{
                reservation.updateDates(checkIn, checkOut);
                System.out.println("Reservation: " + reservation);
            }
        }
    }
    
}
