package br.joaovictor.swing.button;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton botao;

    public MyFrame() {
        botao = new JButton();
        botao.setBounds(200, 100, 100, 50);
        botao.addActionListener(this);
        botao.setText("Botão");
        botao.setFocusable(false);//Para tirar uma borda que aparece circulando o texto do botão
        //botao.setEnabled(false);//Ira deixar o botão desabilidado

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(botao);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==botao) {
            System.out.println("poo");
            botao.setEnabled(false);//Ira deixar o botão desabilidado
        }

    }

}
