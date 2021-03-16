/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Date;

/**
 *
 * @author lelo0
 */
public class Client {
    private String name;
    private String emailString;
    private Date bithDay;
    public Client(){
        
    }

    public Client(String name, String emailString, Date bithDay) {
        this.name = name;
        this.emailString = emailString;
        this.bithDay = bithDay;
    }

    public String getName() {
        return name;
    }

    public String getEmailString() {
        return emailString;
    }

    public void setEmailString(String emailString) {
        this.emailString = emailString;
    }

    public Date getBithDay() {
        return bithDay;
    }
    
}
