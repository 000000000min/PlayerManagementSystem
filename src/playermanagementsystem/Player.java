package playermanagementsystem;

public class Player {
	String name;
    int number;
    String position;
    String nationality;
    
    Player(){
    	
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
}
