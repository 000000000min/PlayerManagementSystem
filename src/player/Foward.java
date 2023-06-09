package player;

import java.util.Scanner;

public class Foward extends FieldPlayer {
	protected String parentNationality;
	public Foward(PlayerPosition position) {
		super(position);
    }	 
	//getUserInput
	public  void getUserInput(Scanner input) {	 
		setPlayerNumber(input);
		setPlayerName(input);
		setPlayerTeam(input);
		setPlayerNationalityWithYN(input);
		setPlayerParentNationalityWithYN(input);
	}
	public void setPlayerParentNationalityWithYN(Scanner input) {
		char answer_nationality = 'X';
		while(answer_nationality != 'y' && answer_nationality != 'Y' && answer_nationality != 'n' && answer_nationality != 'N') {
			System.out.println("Do you know his parent's nationality? (Y/N)");
			
			answer_nationality = input.next().charAt(0);
			if(answer_nationality == 'y'||answer_nationality == 'Y') {
				setPlayerNationality(input); 
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
	
 	public void printInfo() {
 		String pPosition = getKindString();
		System.out.println("| position: "+ pPosition +" | name : " + name + " | number : " + number + " | team : " + team + " | nationality : " + nationality + " |");
	}
 	
 	
}