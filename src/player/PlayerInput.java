package player;

import java.util.Scanner;

import exception.TeamFormatException;

public interface PlayerInput {
	
	public int getNumber();
	
	public void setNumber(int number);
	
	public String getName();
	
	public void setName(String name);
	
	public String getTeam();
	
	public void setTeam(String team) throws TeamFormatException;
	
	public String getNationality();
	
	public void setNationality(String nationality);
	
	public  void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setPlayerNumber(Scanner input);
	
	public void setPlayerName(Scanner input);
	
	public void setPlayerTeam(Scanner input);
	
	public void setPlayerNationality(Scanner input);
	
}
