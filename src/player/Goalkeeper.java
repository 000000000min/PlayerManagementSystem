package player;

import java.util.Scanner;

public class Goalkeeper extends Player{
    public Goalkeeper(PlayerPosition position) {
    	super(position);
    }
    //getUserInput1
    public void getUserInput(Scanner input) {
		setPlayerNumber(input);
		setPlayerName(input);
		setPlayerTeam(input);
		setPlayerNationality(input); 
 	}
    public void printInfo() {
    	String pPosition = getKindString();
		System.out.println("| position: "+ pPosition +" | name : " + name + " | number : " + number + " | team : " + team + " | nationality : " + nationality + " |");
	}
}
