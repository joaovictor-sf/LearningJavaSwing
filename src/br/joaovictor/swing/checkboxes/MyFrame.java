package br.joaovictor.swing.checkboxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JCheckBox checkBox;
    JButton button;
    ImageIcon xIcon;
    ImageIcon checkIcon;

    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        xIcon = new ImageIcon();
        checkIcon = new ImageIcon();

        checkBox = new JCheckBox();
        checkBox.setText("I am not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN,35));
        //checkBox.setIcon(xIcon);//Vai setar um icone para quando a checkbox não esteja selecionada
        //checkBox.setSelectedIcon(checkIcon);//Vai setar um icone para quando a checkbox esteja selecionada

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(checkBox.isSelected());
        }
    }

}
