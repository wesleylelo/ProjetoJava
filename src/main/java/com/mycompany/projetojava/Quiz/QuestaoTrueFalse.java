package com.mycompany.projetojava.Quiz;

import javax.swing.*;

public class QuestaoTrueFalse extends Questao {

    ListQuestionsAnswers qa;
    String result;
    String str;

    QuestaoTrueFalse(ListQuestionsAnswers qa, String result) {
        super(qa.getListQuestao().get(0).toString());
        JPanel buttons = new JPanel();
        this.qa = qa;
        this.result = result;
        respostaCorreta = qa.getListResposta().get(0).toString();
        addButton(buttons, "TRUE");
        addButton(buttons, "FALSE");
        this.questao.add(buttons);
        initQuestionDialog();
    }

    public ListQuestionsAnswers getQa() {
        return qa;
    }

    public void setQa(ListQuestionsAnswers qa) {
        this.qa = qa;
    }

    void addButton(JPanel buttons, String label) {
        JButton button = new JButton(label);
        button.addActionListener(questao);
        buttons.add(button);
    }

    void valid() {
        synchronized (qa) {
            str = result;
            str = str.toUpperCase();

            if (str.equals("T") || str.equals("TRUE") || str.equals("Y") || str.equals("YES")) {
                result = "TRUE";
            } else if (str.equals("F") || str.equals("FALSE") || str.equals("N") || str.equals("NO")) {
                result = "FALSE";
            }

        }

    }

    @Override
    public void run() {
        valid();
    }
}
