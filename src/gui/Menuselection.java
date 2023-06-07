package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ButtonAddListener;
import listeners.ButtonViewListener;

public class Menuselection extends JPanel{
	
	WindowFrame frame;
	
	public Menuselection(WindowFrame frame) {
		this.frame = frame;
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Add Player");
		JButton button2 = new JButton("View Player");
		JButton button3 = new JButton("Edit Player");
		JButton button4 = new JButton("Delete Player");
		JButton button5 = new JButton("Exit Program");
		
		
		button1.addActionListener(new ButtonAddListener(frame));
		button2.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH); //레이블을 붙인다.
		this.add(panel2, BorderLayout.CENTER);
		

	}
}
