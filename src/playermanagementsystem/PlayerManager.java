package playermanagementsystem;

import java.util.Scanner;
import java.util.ArrayList;

public class PlayerManager {
	ArrayList<Player> players = new ArrayList<Player>();
	Scanner input;
	PlayerManager(Scanner input){
		this.input = input;
	}
	
	public void addPlayer() {
		Player player = new Player();
		
		System.out.print("Player Number: ");
		player.number =input.nextInt();
		System.out.print("Player Name: ");
		player.name = input.next();
		System.out.print("Position: ");
		player.position =input.next();
		System.out.print("Nationality: ");
		player.nationality =input.next();
		players.add(player);
	}
	public void deletePlayer() {
		System.out.print("Player Number to delete: ");
		int playerNumber= input.nextInt();
		int index = -1;
		for(int i = 0; i < players.size();i++) {
			if(players.get(i).number == playerNumber) {
				index = i;
				break;
			}
		}
		if(index >= 0) {
			players.remove(index);
			System.out.println("the player " + playerNumber + "is deleted.");
		}
		else {
			System.out.println("the player has not been registered.");
			return;
		}
	}
    public void editPlayer() {
		System.out.print("Player Number: ");
		int playerNumber= input.nextInt();
		for(int i = 0; i < players.size();i++) {
			Player player = players.get(i);
			if(player.number == playerNumber) {
				int num = -1;
				while(num != 5) {
					System.out.println("** Player Info Edit Menu **");
					System.out.println(" 1. Edit Number");
					System.out.println(" 2. Edit Name");
					System.out.println(" 3. Edit Position");
					System.out.println(" 4. Edit Nationality");
					System.out.println(" 5. Exit");
					System.out.println("Select one number between 1 - 5: ");
					num = input.nextInt();
					switch(num) {
						case 1: {
							System.out.print("Player Number: ");
							player.number = input.nextInt();
							break;
						}
						case 2: {
							System.out.print("Player Name: ");
							player.name = input.next();
							break;
						}
						case 3: {
							System.out.print("Player Position: ");
							player.position = input.next();
							break;
						}
						case 4: {
							System.out.print("Player Nationality: ");
							player.nationality = input.next();
							break;
						}
						case 5: {
							continue;
						}//case
					}//switch
				}//while
				break;
			} //if
		}//for
	}//editPlayer

    public void viewPlayers() {
//		System.out.print("Player Number to view: ");
//		int playerNumber= input.nextInt();
    	for(int i = 0; i < players.size();i++) {
    		players.get(i).printInfo();
    	}
    }
}
