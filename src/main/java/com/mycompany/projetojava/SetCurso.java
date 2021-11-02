/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetojava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author lelo0
 */
public class SetCurso {
   Set<SetAluno> set;

    public SetCurso( Set<SetAluno> set) {
        
        this.set = set;
    }

    public Set<SetAluno> getSet() {
        return set;
    }

    public void setSet(Set<SetAluno> set) {
        this.set = set;
    }
}
