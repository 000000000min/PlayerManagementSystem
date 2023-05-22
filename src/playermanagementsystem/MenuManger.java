package playermanagementsystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManger {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		PlayerManager playerManager = new PlayerManager(input);
		selectMenu(input, playerManager);

	}//main
	
	public static void selectMenu(Scanner input, PlayerManager playerManager) {
		int num = -1;
		while(num != 5) {
			try {
				showMenu();
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
						continue; //break;
				}//switch
			}
			catch(InputMismatchException e) {
				System.out.println("Plaese put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}//while
	}
	public static void showMenu() {
		System.out.println("*** Player Management System Menu ***");
		System.out.println("1. Add Player");	
		System.out.println("2. Delete Player");
		System.out.println("3. Edit Player");
		System.out.println("4. View Players");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-5:");
	}
}//class
