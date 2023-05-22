package playermanagementsystem;

import java.util.Scanner;

import player.Defender;
import player.Foward;
import player.Goalkeeper;
import player.Midfielder;
import player.Player;
import player.PlayerInput;
import player.PlayerPosition;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class PlayerManager{
	ArrayList<PlayerInput> players = new ArrayList<PlayerInput>();
	Scanner input;
	PlayerManager(Scanner input){
		this.input = input;
	}
	
	public void addPlayer() {
		int position = 0;
		PlayerInput playerInput;
		while(position < 1 || position > 4) {
			try {
				System.out.println("1 for Goalkeeper");
				System.out.println("2 for Defender");
				System.out.println("3 for Midfielder");
				System.out.println("4 for Foward");
				System.out.print("Select num 1, 2, 3 or 4 for Player position : ");
				position = input.nextInt();
				if(position == 1) {
					playerInput = new Goalkeeper(PlayerPosition.Goalkeeper);
					playerInput.getUserInput(input);
					players.add(playerInput); 
					break;
				}
				else if(position == 2) {
					playerInput = new Defender(PlayerPosition.Defender);
					playerInput.getUserInput(input);
					players.add(playerInput);
					break;
				}
				else if(position == 3) {
					playerInput  = new Midfielder(PlayerPosition.Midfielder);
					playerInput.getUserInput(input);
					players.add(playerInput);
					break;
				}
				else if(position == 4) {
					playerInput  = new Foward(PlayerPosition.Foward);
					playerInput.getUserInput(input);
					players.add(playerInput);
					break;
				}
				else
					System.out.print("Select num for Player position between 1 and 4");
			}//try
			catch(InputMismatchException e) {
				System.out.println("Plaese put an integer between 1 and 4!");
				if(input.hasNext()) {
					input.next();
				}
				position = -1;
			}//catch
		}//while
	}
	public void deletePlayer() {
		System.out.print("Player Number to delete: ");
		int playerNumber = input.nextInt();
		int index = findIndex(playerNumber);
		removeFromPlayer(index, playerNumber);
	}
	
	public int findIndex(int playerNumber) {
		int index = -1;
		for(int i = 0; i < players.size();i++) {
			if(players.get(i).getNumber() == playerNumber) {
				index = i;
				break;
			}
		}
		return index;
	}
	public int removeFromPlayer(int index, int playerNumber) {
		if(index >= 0) {
			players.remove(index);
			System.out.println("the player " + playerNumber + " is deleted.");
			return 1;
		}
		else {
			System.out.println("the player has not been registered.");
			return -1;
		}
	}
	
    public void editPlayer() {
		System.out.print("Player Number: ");
		int playerNumber= input.nextInt();
		for(int i = 0; i < players.size();i++) {
			PlayerInput player = players.get(i);
			if(player.getNumber() == playerNumber) {
				int num = -1;
				while(num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
						case 1:
							player.setPlayerNumber(input);
							break;
						case 2:
							player.setPlayerName(input);
							break;
						case 3:
							player.setPlayerTeam(input);
							break;
						case 4:
							player.setPlayerNationality(input);
							break;
						case 5: 
							continue;//case
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
    
    
    public void showEditMenu() {
    	System.out.println("** Player Info Edit Menu **");
		System.out.println(" 1. Edit Number");
		System.out.println(" 2. Edit Name");
		System.out.println(" 3. Edit Team");
		System.out.println(" 4. Edit Nationality");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5: ");
    }
}
