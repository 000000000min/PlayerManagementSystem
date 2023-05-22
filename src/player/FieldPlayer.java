package player;

import java.util.Scanner;

public abstract class FieldPlayer extends Player {
	public FieldPlayer(PlayerPosition position) {
    	super(position);
    }
	@Override
	public abstract void getUserInput(Scanner input); 
	public void setPlayerNationalityWithYN(Scanner input) {
		char answer_nationality = 'X';
		while(answer_nationality != 'y' && answer_nationality != 'Y' && answer_nationality != 'n' && answer_nationality != 'N') {
			System.out.println("Do you know his nationality? (Y/N)");
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
	@Override
	public void printInfo() {
		String pPosition = getKindString();
		System.out.println("| position: "+ pPosition +" | name : " + name + " | number : " + number + " | team : " + team + " | nationality : " + nationality + " |");
	}
}
