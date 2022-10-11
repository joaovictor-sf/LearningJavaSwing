package br.joaovictor.swing.frame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        //JFrame = Uma página GUI a qual poderemos adicionar componetes

        //JFrame frame = new JFrame();//Cria uma página
        this.setTitle("Título");//Decide o título da página
        this.setSize(420,420); //decide as dimensões da página

        //Por default, mesmo que vc feche a página a operação continuará
        //this.setDefaultCloseOperation(Jthis.HIDE_ON_CLOSE);//Esse é o default
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Agora, quando vc fechar a página a opeção acaba

        this.setResizable(false);//Decide se o tamanho da página pode ou não ser modificado pelo mouse. Tambem impede de ficar tela cheia

        ImageIcon image = new ImageIcon("logoGUI.jpg");//Cria uma ImageIcon
        this.setIconImage(image.getImage());//Muda o icone da página

        //Dessa forma vc pode mudar a cor de fundo
        //Vc pode escolher entre algumas cores fixas ou pode escolher uma cor especifica
        //this.getContentPane().setBackground(Color.green);
        this.getContentPane().setBackground(new Color(195, 141, 212));

        this.setVisible(true); //Torna a página visivel
    }
}
