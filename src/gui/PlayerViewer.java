package gui;

import java.awt.ScrollPane;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import player.PlayerInput;
import playermanagementsystem.PlayerManager;

public class PlayerViewer extends JPanel{

	WindowFrame frame;
	
	PlayerManager playerManager;
	
	public PlayerViewer(WindowFrame frame,PlayerManager playerManager) {
		this.frame = frame;
		this.playerManager = playerManager;
		
		System.out.println("***"+playerManager.size()+"***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Number");
		model.addColumn("Name");
		model.addColumn("Team");
		model.addColumn("Nationality");
		
		for(int i=0;i< playerManager.size();i++) {
			Vector row = new Vector();
			PlayerInput si = playerManager.get(i);
			row.add(si.getNumber());
			row.add(si.getName());
			row.add(si.getTeam());
			row.add(si.getNationality());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		
		this.add(sp);
		 
	}

}
