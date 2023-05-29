package player;

import java.io.Serializable;
import java.util.Scanner;

import exception.TeamFormatException;

public abstract class Player implements PlayerInput,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5700977186574448331L;
	
	protected PlayerPosition position = PlayerPosition.Goalkeeper; //defalut값
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

	public void setTeam(String team) throws TeamFormatException {
		if(!team.contains("FC")&&!team.equals("")) {
			throw new TeamFormatException();
		}
		
		this.team = team;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}	
 	public abstract void printInfo();
 	
 	public void setPlayerNumber(Scanner input) {
    	System.out.print("Player Number: ");
		int number = input.nextInt();
		this.setNumber(number);
    }
    public void setPlayerName(Scanner input) {
    	System.out.print("Player Name: ");
		String name = input.next();
		this.setName(name);
    }
    public void setPlayerTeam(Scanner input) {
    	String team = "";
    	while(!team.contains("FC")) {
	    	System.out.print("Player Team: ");
			team = input.next();
			try {
				this.setTeam(team);
			} catch (TeamFormatException e) {
				System.out.println("Incorrect Team Format. put the team name that contains 'FC'.");
			}
    	}
    }
    public void setPlayerNationality(Scanner input) {
    	System.out.print("Player Nationality: ");
		String nationality = input.next();
		this.setNationality(nationality);
    }
    public String getKindString() { 
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
 		return pPosition;   
 	}
 	
}
