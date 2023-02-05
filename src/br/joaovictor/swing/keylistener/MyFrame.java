package br.joaovictor.swing.keylistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {
    //KeyChar é a tecla em si(a, \, etc)
    //KeyCode: Toda a tecla possui um número que a corresponde, a é 61 por exemplo.

    JLabel label;

    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //Invocado quando a tecla é . Ultiliza KeuChar, char output
        switch (e.getKeyChar()) {
            case 'a': label.setLocation(label.getX()-10, label.getY());
            break;
            case 'w': label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's': label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'd': label.setLocation(label.getX() + 10, label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //KeyPressed
        switch (e.getKeyCode()) {
            case 37: label.setLocation(label.getX()-10, label.getY());
                break;
            case 38: label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 40: label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 39: label.setLocation(label.getX() + 10, label.getY());
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //called whenever a button is released
        System.out.println("You release key char: " + e.getKeyChar());
        System.out.println("You release key code: " + e.getKeyCode());
    }
}
