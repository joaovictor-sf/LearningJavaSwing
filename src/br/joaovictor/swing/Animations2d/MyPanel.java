package br.joaovictor.swing.Animations2d;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    //Image enemy;
    //Image backgroundImage;
    JLabel label;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    public MyPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        //enemy = new ImageIcon("me.jpg").getImage();

        label = new JLabel();
        //label.setBounds(100, 100, 100, 100);
        label.setSize(100, 100);
        label.setLocation(100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        this.add(label);
        timer = new Timer(1000, null);
        //timer.start();
    }

    /*public void paint(Graphics g){
        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(enemy, x, y, null);
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        //x = x + xVelocity;
        //label.setLocation(label.getX(), label.getY()-10);
    }
}
