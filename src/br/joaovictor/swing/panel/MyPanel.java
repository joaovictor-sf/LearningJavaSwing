package br.joaovictor.swing.panel;

import javax.swing.*;
import java.awt.*;

public class MyPanel {

    public static void main(String[] args) {
        //JPanel = Um componeten GUI que funciona como um container onde colocamos outros componetes
        ImageIcon icone = new ImageIcon("transferir.png");

        JLabel label = new JLabel();
        label.setText("Hello World");
        label.setIcon(icone);
        //label.setVerticalAlignment(JLabel.BOTTOM);
        //label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(200, 200, 75, 75);//Lembrando que para ultilizar bounds o layaout tem ser null


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 300);
        redPanel.add(label);
        //redPanel.setLayout(new BorderLayout());
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 300);
        //bluePanel.setLayout(new BorderLayout());
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 400);
        //greenPanel.setLayout(new BorderLayout());// Coloca o conteudo dentro do container na borda e permite modificar sua posição
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 700);
        frame.setVisible(true);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        greenPanel.add(label);
    }
}
