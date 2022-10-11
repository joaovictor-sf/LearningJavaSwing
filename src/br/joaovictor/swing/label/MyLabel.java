package br.joaovictor.swing.label;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyLabel {

    public static void main(String[] args) {
        //JLabel = a GUI mostra uma area para texto, imagem ou ambos

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500 ,400);
        //frame.setLayout(null);

        ImageIcon image = new ImageIcon("transferir.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);//Cria uma borda

        JLabel label = new JLabel();//Cria um label
        label.setText("Hello World");//Modifica o texto do label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set o texto para a esquerda, direita ou centro da imagem
        label.setVerticalTextPosition(JLabel.TOP); //set o texto no topo, base ou centro da imagem
        label.setForeground(new Color(0x00ff00)); //Muda a cor da fonte
        label.setFont(new Font("MV Boli",Font.PLAIN,20));//Muda a fonte
        label.setIconTextGap(-25);//Modifica o espaçamento entre o texto e a imagem
        label.setBackground(Color.black);//Modifica a cor do background
        label.setOpaque(true);//Mostra a cor do background
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);//Modifica eixo y do icone+texto dentro do label
        label.setHorizontalAlignment(JLabel.CENTER);//Modifica eixo x do icone+texto dentro do label
        //label.setBounds(100, 0, 300, 300);//Modifica a posição o label no eixo x e y do frame, assim com modifica suas dimensões

        frame.add(label);

        //Ira ajustar a página de acordo com o tamanho do label
        frame.pack();//Para funcionar é necessario não ter label.setBounds, frame.setSize e frame.setLayout no código

        frame.setVisible(true);
    }
}
