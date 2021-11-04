package com.mycompany.projetojava.Quiz;

public class Quizz {

    public static void main(String[] args) {
        ListQuestionsAnswers qme, qtf, qtf1;
        qme = new ListQuestionsAnswers();
        qtf = new ListQuestionsAnswers();
        qtf1 = new ListQuestionsAnswers();
        qme.getListQuestao().add("Qual desses continentes é considerado um país?");
        qme.getListResposta().add("Antártida");
        qme.getListResposta().add("Austrália");
        qme.getListResposta().add("África");
        qme.getListResposta().add("Ásia");
        qme.getListResposta().add("América");

        qtf.getListQuestao().add("Existem dois tipos sanguíneos");
        qtf.getListResposta().add("FALSE");
        qtf1.getListQuestao().add("Batata é uma fonte de vitamina C");
        qtf1.getListResposta().add("TRUE");
        Questao questoes = new QuestaoMultiplaEscolha(qme, "B");
        questoes.start();
        questoes.check();
        questoes = new QuestaoTrueFalse(qtf, qtf.getListResposta().get(0).toString());
        questoes.start();
        questoes.check();

        questoes = new QuestaoTrueFalse(qtf1, qtf1.getListResposta().get(0).toString());
        questoes.start();
        questoes.check();
        Questao.showResults();

    }
}
