package br.joaovictor.swing.newwindow;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello");

    public NewWindow() {
        label.setBounds(100, 160, 200, 40);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
