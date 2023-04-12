package playermanagementsystem;

import java.util.Scanner;
import java.util.*;

public class PlayerManager {
	Player player;
	Scanner input;
	ArrayList <Player> list  = new ArrayList<Player>();
	
	PlayerManager(Scanner input){
		this.input = input;
	}
	
	public void addPlayer() {
		player = new Player();
		list.add(player);
		System.out.print("Player Number: ");
		player.number =input.nextInt();
		System.out.print("Player Name");
		player.name = input.next();
		System.out.print("Email address: ");
		player.email =input.next();
		System.out.print("Phone number: ");
		player.phone =input.next();

	}
	public void deletePlayer() {
		System.out.print("Player Number to delete: ");
		int playerNumber= input.nextInt();
		if(player == null) {
			System.out.println("the player has not been registered.");
			return;
		}
		if(player.number == playerNumber) {
			player = null;
			System.out.println("the player is deleted.");
		}
	}
    public void editPlayer() {
		System.out.print("Player Number to edit: ");
		int playerNumber= input.nextInt();
		if(player.number == playerNumber) {
			System.out.println("the player to be edited is " + playerNumber);
			System.out.print("Player Number: ");
			player.number =input.nextInt();
			System.out.print("Player Name");
			player.name = input.next();
			System.out.print("Email address: ");
			player.email =input.next();
			System.out.print("Phone number: ");
			player.phone =input.next();
		}
	}
    public void viewPlayer() {
		System.out.print("Player Number to view: ");
		int playerNumber= input.nextInt();
		if(player.number == playerNumber) {
			player.printInfo();
		}
    }
}
