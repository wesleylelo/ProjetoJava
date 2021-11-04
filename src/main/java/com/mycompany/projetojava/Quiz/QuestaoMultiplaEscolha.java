package com.mycompany.projetojava.Quiz;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class QuestaoMultiplaEscolha extends Questao {

    ListQuestionsAnswers qa;
    String resposta;

    public QuestaoMultiplaEscolha(ListQuestionsAnswers qa, String resposta) {
        super(qa.getListQuestao().get(0).toString());
        this.qa = qa;
        this.resposta = resposta;
        respostaCorreta = resposta;
        initQuestionDialog();
    }

    public ListQuestionsAnswers getQa() {
        return qa;
    }

    public void setQa(ListQuestionsAnswers qa) {
        this.qa = qa;
    }

    void addChoiceS() {
        synchronized (qa) {
            addChoice("A", qa.getListResposta().get(0).toString());
            addChoice("B", qa.getListResposta().get(1).toString());
            addChoice("C", qa.getListResposta().get(2).toString());
            addChoice("D", qa.getListResposta().get(3).toString());
            addChoice("E", qa.getListResposta().get(4).toString());
        }
    }

    void addChoice(String nome, String label) {
        synchronized (qa) {
            JPanel escolha = new JPanel(new BorderLayout(10, 0));
            JButton botao = new JButton(nome);
            botao.addActionListener(questao);
            escolha.add(botao, BorderLayout.WEST);
            escolha.add(new JLabel(label + "    ", JLabel.LEFT), BorderLayout.CENTER);
            questao.add(escolha);
        }
    }

    @Override
    public void run() {
        addChoiceS();
    }

}
