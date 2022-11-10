package br.joaovictor.swing.joptionpane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // JOptionPane = Cria uma caixa de dialogo que aparece

        //JOptionPane.showMessageDialog(parentComponent, message, title, messageType);

        /*JOptionPane.showMessageDialog(null, "this is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "here is more useless info", "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "really??", "title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Your computer has a virus!!", "title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Call tech support now or else!!!", "title", JOptionPane.ERROR_MESSAGE);*/

        //System.out.println(JOptionPane.showConfirmDialog(null, "do you even code?", "this is the title", JOptionPane.YES_NO_CANCEL_OPTION));
        //Retorna um valor int, yes = 0, no = 1, cancel = 2 e close = -1;
        //int answer = JOptionPane.showConfirmDialog(null, "do you even code?", "this is the title", JOptionPane.YES_NO_CANCEL_OPTION);

        /*String nome = JOptionPane.showInputDialog("Whats your name?");
        System.out.println("Hello "+nome);*/

        //JOptionPane.showOptionDialog(parentComponent, message, title, optionType, messageType, icon, options, initialValue)
        String[] responses = {"No, you're aresome", "Thanks", "*blush*"};
        ImageIcon icon = new ImageIcon("transferir.png");
        JOptionPane.showOptionDialog(null, "You're awesome!", "secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);

    }
}
