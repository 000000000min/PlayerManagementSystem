package player;

import java.util.Scanner;

public class Goalkeeper extends Player implements PlayerInput{
    public Goalkeeper(PlayerPosition position) {
    	super(position);
    }
    //getUserInput1
    public void getUserInput(Scanner input) {
 		System.out.print("Player Number: ");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("Player Name: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Team: ");
		String team =input.next();
		this.setTeam(team);
		
		System.out.print("Nationality: ");
		String nationality =input.next();
		this.setNationality(nationality);
 	}
    public void printInfo() {
 		String pPosition = "none";
 		switch(this.position) {
 			case Goalkeeper:
 				pPosition = "GK";
 				break;
 			case Defender:
 				pPosition = "DF";
 	 			break;
 			case Midfielder:
 				pPosition = "MF";
 	 			break;
 			case Foward:
 				pPosition = "FW";
 	 			break;
 	 		default:
 		}
		System.out.println("| position: "+ pPosition +" | name : " + name + " | number : " + number + " | team : " + team + " | nationality : " + nationality + " |");
	}
}
