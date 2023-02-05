package br.joaovictor.swing.textfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;

    public MyFrame() {
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new FlowLayout());

            button = new JButton("Submit");
            button.addActionListener(this);

            textField = new JTextField();
            textField.setPreferredSize(new Dimension(250, 40));
            textField.setFont(new Font("Consolas", Font.PLAIN,35));
            textField.setForeground(Color.white);
            textField.setBackground(Color.black);
            textField.setCaretColor(Color.white);
            textField.setText("Text");
            //textField.setEditable(false);//Serve para se vc quiser impedir que consigam escrever na caixa de texto

            this.add(button);
            this.add(textField);
            this.pack();
            this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
        System.out.println(textField.getText());
        button.setEnabled(false);
        textField.setEditable(false);
        }
    }
}
