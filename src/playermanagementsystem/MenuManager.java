package playermanagementsystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		PlayerManager playerManager = getObject("playermanager.ser");
		if(playerManager == null) {
			playerManager = new PlayerManager(input);
		}
		
		WindowFrame frame = new WindowFrame(playerManager); 
		selectMenu(input, playerManager);
		putObject(playerManager,"playermanager.ser");

	}//main
	
	public static void selectMenu(Scanner input, PlayerManager playerManager) {
		int num = -1;
		while(num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
					case 1: {
						playerManager.addPlayer();
						logger.log("add a player");
						break;
						}
					case 2:
						playerManager.deletePlayer();
						logger.log("delete a player");
						break;
					case 3:
						playerManager.editPlayer();
						logger.log("edit a player");
						break;
					case 4:
						playerManager.viewPlayers();
						logger.log("view list of players");
						break;
					case 5:
						System.out.println("The Program is finished");
						logger.log("finish the program");
						break;
					default:
						continue; //break;
				}//switch
			}
			catch(InputMismatchException e) {
				System.out.println("Plaese put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}//while
	}
	public static void showMenu() {
		System.out.println("*** Player Management System Menu ***");
		System.out.println("1. Add Player");	
		System.out.println("2. Delete Player");
		System.out.println("3. Edit Player");
		System.out.println("4. View Players");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-5:");
	}
	public static PlayerManager getObject(String filename) {
		PlayerManager playerManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			playerManager = (PlayerManager)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return playerManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return playerManager;
	}
	public static void putObject(PlayerManager playerManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(playerManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}//class
