package br.joaovictor.pratica.HP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Barra implements ActionListener {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();
    JButton AttackButton;
    JButton HealButton;

    int vida;

    public Barra() {
        vida = bar.getMaximum();

        bar.setValue(vida);
        bar.setBounds(10, 10, 400, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        AttackButton = new JButton();
        AttackButton.setBounds(200, 100, 105, 60);
        AttackButton.addActionListener(this);
        AttackButton.setText("Attack");
        AttackButton.setFont(new Font("MV Boli", Font.BOLD, 18));
        AttackButton.setFocusable(false);

        HealButton = new JButton();
        HealButton.setBounds(100, 100, 105, 60);
        HealButton.addActionListener(this);
        HealButton.setText("Heal");
        HealButton.setFont(new Font("MV Boli", Font.BOLD, 18));
        HealButton.setFocusable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 300);
        frame.setLayout(null);
        frame.add(bar);
        frame.add(AttackButton);
        frame.add(HealButton);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==AttackButton) {
            vida -= 10;
            bar.setValue(vida);
            if (vida == 0) {
                bar.setString("DEAD");
                AttackButton.setEnabled(false);
            }
        } else if (e.getSource()==HealButton) {
            vida += 10;
            bar.setValue(vida);
        }
    }
}
