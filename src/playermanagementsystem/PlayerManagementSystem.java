package playermanagementsystem;

import java.util.Scanner;

public class PlayerManagementSystem {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num != 6) {
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
					System.out.print("Player Number to add: ");
					int PlayerNumber1= input.nextInt();
					System.out.print("Player Name: ");
					String PlayerName= input.next();
					break;
					}
				case 2:
					System.out.print("Player Number to delete: ");
					int PlayerNumber2= input.nextInt();
					break;
				case 3:
					System.out.print("Player Number to edit: ");
					int PlayerNumber3= input.nextInt();
					break;
				case 4:
					System.out.print("Player Number to view: ");
					int PlayerNumber4= input.nextInt();
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

}
