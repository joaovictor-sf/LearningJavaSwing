package br.joaovictor.swing.progressbar;

import javax.swing.*;
import java.awt.*;

public class BarraProgressiva {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();//é possivel decidir o tamanho na barra pelo construdor, mas se não colocar nada o default é (0, 100)
    // Uma barra progressiva pode ser usada para mostrar para o usuario que algo esta carregando, ou pode ser usado como uma barra de HP de um jogo

    public BarraProgressiva() {
        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill() {
        int counter = 0;
        while (counter<= 100){
            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

            counter += 1;
        }

        bar.setString("Completo");
    }

}
