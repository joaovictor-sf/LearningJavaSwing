package br.joaovictor.swing.mouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;

    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Invoked when a mouse button has been clicked (pressed and released) ona component
        //System.out.println("Voce clicou");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //Invoked when a mouse button has been pressed on a component
        System.out.println("Voce preensionou o mouse");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //Invoked when a mouse button has been released on a component
        System.out.println("Voce solou o mouse");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //Invoked when a mouse enter the area of a component
        System.out.println("Entrou na area do componente");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //Invoked when a mouse exit the area of a component
        System.out.println("Saiu na area do componente");
    }
}
