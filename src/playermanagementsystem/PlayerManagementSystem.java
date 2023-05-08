package playermanagementsystem;

import java.util.Scanner;

public class PlayerManagementSystem {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		PlayerManager playerManager = new PlayerManager(input);
		int num = -1;
		while(num != 5) {
			System.out.println("*** Player Management System Menu ***");
			System.out.println("1. Add Player");	
			System.out.println("2. Delete Player");
			System.out.println("3. Edit Player");
			System.out.println("4. View Players");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1-5:");
			num = input.nextInt();
			
			switch(num) {
				case 1: {
					playerManager.addPlayer();
					break;
					}
				case 2:
					playerManager.deletePlayer();
					break;
				case 3:
					playerManager.editPlayer();
					break;
				case 4:
					playerManager.viewPlayers();
					break;
				case 5:
					System.out.println("The Program is finished");
					break;
				default:
					System.out.println("Plaese enter a number between 1-5!");
					continue; //break;
			}
		}

	}
	

}
