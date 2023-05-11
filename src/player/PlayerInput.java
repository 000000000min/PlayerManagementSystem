package player;

import java.util.Scanner;

public interface PlayerInput {
	
	public void setNumber(int number);
	
	public void setName(String name);
	
	public void setTeam(String team);
	
	public void setNationality(String nationality);
	
	public int getNumber();
	
	public  void getUserInput(Scanner input);
	
	public void printInfo();
}
