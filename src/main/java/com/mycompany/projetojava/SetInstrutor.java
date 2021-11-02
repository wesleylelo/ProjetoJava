/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetojava;

import java.util.List;

/**
 *
 * @author lelo0
 */
public class SetInstrutor {
    private String nome;
    List<SetCurso> list;

    public SetInstrutor(List<SetCurso> list) {
        this.list = list;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<SetCurso> getList() {
        return list;
    }

    public void setList(List<SetCurso> list) {
        this.list = list;
    }
}
