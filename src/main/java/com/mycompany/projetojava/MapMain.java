/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetojava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;

/**
 *
 * @author lelo0
 */
public class MapMain {

    public static void main(String[] args) {
        String path = "C:\\Users\\lelo0\\OneDrive\\Área de Trabalho\\URNAS.txt";
        Integer value;
        Map<String, Integer> cookies = new TreeMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String lines = br.readLine();
            while (lines != null) {
                String[] vector = lines.split(",");
                value = Integer.parseInt(vector[1]);
                if (cookies.containsKey(vector[0])) {
                    cookies.put(vector[0], value + cookies.get(vector[0]));
                } else {
                    cookies.put(vector[0], value);
                }
                lines = br.readLine();
            }
            for (String key : cookies.keySet()) {
                System.out.println(key + ", " + cookies.get(key));
            }
        } catch (IOException e) {

        }
    }
}
