package player;

import java.util.Scanner;

public class Player {
	protected PlayerPosition position = PlayerPosition.Goalkeeper;
	protected String name;
	protected int number;
	protected String team;
	protected String nationality;
	
    public Player(){
    	
    }
    public Player(PlayerPosition position) {
    	this.position = position;
    }
    
    public Player(String name, int number) {
    	this.name = name;
    	this.number = number;
    }
    public Player(String name, int number, String team, String nationality ) {
    	this.name = name;
    	this.number = number;
    	this.team = team;
    	this.nationality = nationality;
    }
    
    public Player(PlayerPosition position, String name, int number, String team, String nationality ) {
    	this.position = position;
    	this.name = name;
    	this.number = number;
    	this.team = team;
    	this.nationality = nationality;
    }
    public PlayerPosition getPosition() {
		return position;
	}

	public void setPosition(PlayerPosition position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
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
}
