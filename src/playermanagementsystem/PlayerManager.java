package playermanagementsystem;

import java.util.Scanner;

import player.Defender;
import player.Player;

import java.util.ArrayList;

public class PlayerManager {
	ArrayList<Player> players = new ArrayList<Player>();
	Scanner input;
	PlayerManager(Scanner input){
		this.input = input;
	}
	
	public void addPlayer() {
		int kind = 0;
		Player player;
		while(kind != 1 && kind != 2 && kind != 3 && kind != 4) {
			System.out.println("1 for Goalkeeper");
			System.out.println("2 for Defender");
			System.out.println("3 for Midfielder");
			System.out.println("4 for Foward");
			System.out.println("Select num for Player Kind between 1 and 4");
			kind = input.nextInt();
			if(kind == 1) {
				player  = new Player();
				player.getUserInput(input);
				players.add(player); 
				break;
			}
			else if(kind == 2) {
				player  = new Defender();
				player.getUserInput(input);
				players.add(player);
				break;
			}
			else if(kind == 3) {
				player  = new Player();
				players.add(player);
				break;
			}
			else if(kind == 4) {
				player  = new Player();
				players.add(player);
				break;
			}
			else
				System.out.print("Select num for Player Kind between 1 and 4");
		}
	}
	public void deletePlayer() {
		System.out.print("Player Number to delete: ");
		int playerNumber = input.nextInt();
		int index = -1;
		for(int i = 0; i < players.size();i++) {
			if(players.get(i).getNumber() == playerNumber) {
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
			if(player.getNumber() == playerNumber) {
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
							int number = input.nextInt();
							player.setNumber(number);
							break;
						}
						case 2: {
							System.out.print("Player Name: ");
							String name = input.next();
							player.setName(name);
							break;
						}
						case 3: {
							System.out.print("Player Position: ");
							String position = input.next();
							player.setPosition(position);
							break;
						}
						case 4: {
							System.out.print("Player Nationality: ");
							String nationality = input.next();
							player.setNationality(nationality);
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
    	System.out.println("# of registered players: " + players.size());
    	for(int i = 0; i < players.size();i++) {
    		players.get(i).printInfo();
    	}
    }
}
