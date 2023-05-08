package player;

import java.util.Scanner;

public class Defender extends Player {
	public Defender(PlayerPosition position) {
    	super(position);
    }
	public  void getUserInput(Scanner input) {
 		//번호
		char answer_num = 'X';
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
		//이름
		char answer_name = 'X';
		while(answer_name != 'y' && answer_name != 'Y' && answer_name != 'n' && answer_name != 'N') {
			System.out.println("Do you know his name? (Y/N)");
			answer_name = input.next().charAt(0);
			if(answer_name == 'y'||answer_name == 'Y') {
				System.out.print("Name: ");
				String name =input.next();
				this.setName(name);
				break;
			}
			else if(answer_name == 'n'||answer_name == 'N') {
				this.setName("");
				break;
			}
			else {
			}
		}
		//팀
		char answer_team = 'X';
		while(answer_team != 'y' && answer_team != 'Y' && answer_team != 'n' && answer_team != 'N') {
			System.out.println("Do you know his team? (Y/N)");
			answer_team = input.next().charAt(0);
			if(answer_team == 'y'||answer_team == 'Y') {
				System.out.print("Team: ");
				String team =input.next();
				this.setTeam(team);
				break;
			}
			else if(answer_team == 'n'||answer_team == 'N') {
				this.setTeam("");
				break;
			}
			else {
			}
		}
		//국적
		char answer_nationality = 'X';
		while(answer_nationality != 'y' && answer_nationality != 'Y' && answer_nationality != 'n' && answer_nationality != 'N') {
			System.out.println("Do you know his nationality? (Y/N)");
			answer_nationality = input.next().charAt(0);
			if(answer_nationality == 'y'||answer_nationality == 'Y') {
				System.out.print("Nationality: ");
				String nationality =input.next();
				this.setNationality(nationality);
				break;
			}
			else if(answer_nationality == 'n'||answer_nationality == 'N') {
				this.setNationality("");
				break;
			}
			else {
			}
		}
 	}
}
