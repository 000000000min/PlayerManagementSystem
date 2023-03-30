package playermanagementsystem;

import java.util.Scanner;

public class PlayerManagementSystem {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num != 6) {
			System.out.println("*** Player Management System Menu ***");
			System.out.println("1. Add Player");	
			System.out.println("2. Delete Player");
			System.out.println("3. Edit Player");
			System.out.println("4. View Player");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6:");
			num = input.nextInt();
			
			switch(num) {
				case 1: {
					addPlayer();
					break;
					}
				case 2:
					deletePlayer();
					break;
				case 3:
					editPlayer();
					break;
				case 4:
					viewPlayer();
					break;
				case 5:
					
					break;
				case 6:
					
					break;
				default:
					System.out.println("Plaese enter a number between 1-6!");
					break;
			}
		}

	}
	public static void addPlayer() {
		Scanner input = new Scanner(System.in);
		System.out.print("Player Number: ");
		int playerNumber =input.nextInt();
		System.out.print("Player Name");
		String playerName = input.next();
		System.out.print("Email address: ");
		String playerEmail =input.next();
		System.out.print("Phone number: ");
		String playerPhone =input.next();

	}
	public static void deletePlayer() {
		Scanner input = new Scanner(System.in);
		System.out.print("Player Number to delete: ");
		int PlayerNumber= input.nextInt();
	}
    public static void editPlayer() {
    	Scanner input = new Scanner(System.in);
		System.out.print("Player Number to edit: ");
		int PlayerNumber= input.nextInt();
	}
    public static void viewPlayer() {
    	Scanner input = new Scanner(System.in);
		System.out.print("Player Number to view: ");
		int PlayerNumber= input.nextInt();
    }

}
