package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class PlayerAdder extends JFrame {
	public PlayerAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		//번호
		JLabel labelNumber = new JLabel("Number : ", JLabel.TRAILING);
		JTextField fieldNumber = new JTextField(10);
		labelNumber.setLabelFor(fieldNumber);
		panel.add(labelNumber);
		panel.add(fieldNumber);
		
		//이름
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		//팀
		JLabel labelTeam = new JLabel("Team : ", JLabel.TRAILING);
		JTextField fieldTeam = new JTextField(10);
		labelTeam.setLabelFor(fieldTeam);
		panel.add(labelTeam);
		panel.add(fieldTeam);
		
		//국적
		JLabel labelNationality = new JLabel("Nationality : ", JLabel.TRAILING);
		JTextField fieldNationality = new JTextField(10);
		labelNationality.setLabelFor(fieldNationality);
		panel.add(labelNationality);
		panel.add(fieldNationality);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
