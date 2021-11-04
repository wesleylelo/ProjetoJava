package com.mycompany.projetojava.Quiz;

import java.awt.*;
import javax.swing.*;
import java.sql.Timestamp;

public abstract class Questao extends Thread {

    static int nQuestoes = 0;
    static int nCorretas = 0;
    static long iniciarTempo = new Timestamp(System.currentTimeMillis()).getTime();
    static long finalizarTempo = 0;

    QuestaoDialog questao;
    String respostaCorreta;

    Questao(String question) {
        this.questao = new QuestaoDialog();
        this.questao.setLayout(new GridLayout(0, 1, 0, 5)); // adicionar espaço horizontal de 5px entre linhas 
        this.questao.add(new JLabel("    " + question + "    ", JLabel.CENTER));
    }

    void initQuestionDialog() {
        questao.setModal(true);
        questao.pack();
        questao.setLocationRelativeTo(null);
    }

    String ask() {
        questao.setVisible(true);
        return questao.resposta;
    }

    void check() {
        String answer = ask();
        if (answer.equals(respostaCorreta)) {
            JOptionPane.showMessageDialog(null, "Correto!");
            nCorretas++;
        } else {
            JOptionPane.showMessageDialog(null, "Incorreto! A resposta correta é " + respostaCorreta);
        }
        nQuestoes++;
    }

    static void showResults() {
        finalizarTempo = new Timestamp(System.currentTimeMillis()).getTime();
        long takenTime = (finalizarTempo - iniciarTempo) / 1000;
        JOptionPane.showMessageDialog(null, nCorretas + " corretos de " + nQuestoes + ".Você gastou " + takenTime + " segundos no quiz");
    }
}
