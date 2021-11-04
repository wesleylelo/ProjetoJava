package com.mycompany.projetojava.Quiz;

import java.awt.event.*;
import javax.swing.*;

public class QuestaoDialog extends JDialog implements ActionListener {

    String resposta;

    @Override
    public void actionPerformed(ActionEvent e) {
        resposta = e.getActionCommand();
        dispose();
    }
}
