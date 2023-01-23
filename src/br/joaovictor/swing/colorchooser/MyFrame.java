package br.joaovictor.swing.selectfile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;

    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            JFileChooser fileChooser = new JFileChooser();

            //Set current directory
            //"." will go to the project folder
            fileChooser.setCurrentDirectory(new File("C:\\Users\\User\\Desktop"));

            //int response = fileChooser.showOpenDialog(null);//select file to open
            int response2 = fileChooser.showSaveDialog(null);//Select file to save

            if (response2 == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
}
