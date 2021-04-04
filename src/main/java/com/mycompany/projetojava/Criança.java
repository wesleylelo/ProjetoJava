/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetojava;

import java.util.ArrayList;

/**
 *
 * @author lelo0
 */
public class Criança {
    private String nome;
    private Integer idade;
    private ArrayList<Brinquedo> joys = new ArrayList<Brinquedo>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Criança(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public ArrayList<Brinquedo> getJoys() {
        return joys;
    }
    public void addJoy(Brinquedo joy){
        if(joys.size() <= 10) joys.add(joy);
        else System.out.println("Está cheio");
    }
    public void doarJoy(ArrayList<Brinquedo> outro, Brinquedo name, Criança outra){
        if(outra.getIdade() >= name.getIdadeM())
        outro.add(getJoys().get(getJoys().indexOf(name.getNome())));
        else System.out.println(outra.getNome() + " não possui a idade mínima de " 
                + name.getIdadeM());
    }
}
