/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetojava.Quiz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lelo0
 */
public class ListQuestionsAnswers {

    List<String> list;
    List<String> list2;

    public void setAnswer(List<String> list) {
        this.list = list;
    }

    public void setQuestion(List<String> list2) {
        this.list2 = list2;
    }

    public ListQuestionsAnswers() {
        list2 = new ArrayList<>();
        list = new ArrayList<>();
    }

    public List getListResposta() {
        return list;
    }

    public List getListQuestao() {
        return list2;
    }

}
