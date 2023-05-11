package player;

import java.util.Scanner;

public abstract class Player {
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

	public void setTeam(String team) {
		this.team = team;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}	
 	public abstract void printInfo();
 	
}
