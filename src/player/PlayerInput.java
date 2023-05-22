package player;

import java.util.Scanner;

import exception.TeamFormatException;

public interface PlayerInput {
	
	public void setNumber(int number);
	
	public void setName(String name);
	
	public void setTeam(String team) throws TeamFormatException;
	
	public void setNationality(String nationality);
	
	public int getNumber();
	
	public  void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setPlayerNumber(Scanner input);
	
	public void setPlayerName(Scanner input);
	
	public void setPlayerTeam(Scanner input);
	
	public void setPlayerNationality(Scanner input);
	
}
