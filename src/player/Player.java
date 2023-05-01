package player;

import java.util.Scanner;

public class Player {
	protected PlayerKind kind = PlayerKind.Goalkeeper;
	protected String name;
	protected int number;
	protected String position;
	protected String nationality;
    
	public PlayerKind getKind() {
		return kind;
	}

	public void setKind(PlayerKind kind) {
		this.kind = kind;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
    public Player(){
    	
    }
    
    public Player(String name, int number) {
    	this.name = name;
    	this.number = number;
    }
    public Player(String name, int number, String position, String nationality ) {
    	this.name = name;
    	this.number = number;
    	this.position = position;
    	this.nationality = nationality;
    }
 	public void printInfo() {
		System.out.println("name : " + name + "  " + "number : " + number + "  " + "position : " + position + "  " + "nationality : " + nationality);
		
	}
 	public void getUserInput(Scanner input) {
 		System.out.print("Player Number: ");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("Player Name: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Position: ");
		String position =input.next();
		this.setPosition(position);
		
		System.out.print("Nationality: ");
		String nationality =input.next();
		this.setNationality(nationality);
 	}
}
