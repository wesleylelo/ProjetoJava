/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetojava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author lelo0
 */
public class SetMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int id, cursos, alunos, quant;
        Set<SetAluno> discentes = new HashSet();
        List<SetCurso> curso = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int j = 0; j < 3; j++){
           if(j == 0)
                System.out.println("Curso A");
           else if(j == 1)
               System.out.println("Curso B");
           else
               System.out.println("Curso C");
           System.out.println("Digite quantidade de Alunos");
           alunos = sc.nextInt();
           Set<SetAluno> set = new HashSet<>();
        for(int i = 0; i < alunos; i++){
            System.out.println("Digite o ID do aluno");
            id = sc.nextInt();
            set.add(new SetAluno(id));
        }
        curso.add(new SetCurso(set));
        
    }
     SetInstrutor instrutor = new SetInstrutor(curso);
     discentes.addAll(instrutor.getList().get(0).getSet());
     discentes.addAll(instrutor.getList().get(1).getSet());
    discentes.addAll(instrutor.getList().get(2).getSet());
    quant = discentes.size();
    System.out.println(quant);
   }
}
