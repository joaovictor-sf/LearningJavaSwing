package br.joaovictor.swing.Animations2d;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyPanel panel;

    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new MyPanel();
        this.add(panel);
        this.setSize(600, 600);
        //this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
