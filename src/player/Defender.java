package player;

import java.util.Scanner;

public class Defender extends Player {
	public  void getUserInput(Scanner input) {
 		
		int answer_num = 0;
		while(answer_num != 'y' && answer_num != 'Y' && answer_num != 'n' && answer_num != 'N') {
			System.out.println("Do you know his number? (Y/N)");
			answer_num = input.next().charAt(0);
			if(answer_num == 'y'||answer_num == 'Y') {
				System.out.print("Number: ");
				int number =input.nextInt();
				this.setNumber(number);
				break;
			}
			else if(answer_num == 'n'||answer_num == 'N') {
				this.setNumber(0);
				break;
			}
			else {
			}
		}
				
		System.out.print("Player Name: ");
		String name = input.next();
		this.setName(name);
		
		char answer = 'X';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you know his position? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y'||answer == 'Y') {
				System.out.print("Position: ");
				String position =input.next();
				this.setPosition(position);
				break;
			}
			else if(answer == 'n'||answer == 'N') {
				this.setPosition("");
				break;
			}
			else {
			}
		}	
		
		System.out.print("Nationality: ");
		String nationality =input.next();
		this.setNationality(nationality);
 	}
}
