package br.joaovictor.swing.comboboxes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	String[] animais = {"","cão", "cat", "cow"};
	JComboBox comboBox;

	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		comboBox = new JComboBox(animais);
		comboBox.addActionListener(this);
		
		//Alguns metodos
		//comboBox.setEditable(true);
		//System.out.println(comboBox.getItemCount());
		comboBox.addItem("horse");
		comboBox.insertItemAt("bird", 1);
		comboBox.setSelectedIndex(0);//Set o item inicial
		//comboBox.removeItem("cão");
		//comboBox.removeItemAt(0);
		//comboBox.removeAllItems();
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());
			System.out.println(comboBox.getSelectedIndex());
		}
	}

}
