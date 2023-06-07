package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import playermanagementsystem.PlayerManager;

public class WindowFrame extends JFrame{
	
	PlayerManager playerManager;
	
	Menuselection menuselection;
	PlayerAdder playeradder;
	PlayerViewer playerviewer;
	
	
	public WindowFrame(PlayerManager playerManager) {

		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.playerManager = playerManager;
		menuselection = new Menuselection(this);
		playeradder = new PlayerAdder(this);
		playerviewer = new PlayerViewer(this, this.playerManager);
		
		
		
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	public Menuselection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(Menuselection menuselection) {
		this.menuselection = menuselection;
	}

	public PlayerAdder getPlayeradder() {
		return playeradder;
	}

	public void setPlayeradder(PlayerAdder playeradder) {
		this.playeradder = playeradder;
	}

	public PlayerViewer getPlayerviewer() {
		return playerviewer;
	}

	public void setPlayerviewer(PlayerViewer playerviewer) {
		this.playerviewer = playerviewer;
	}

}
