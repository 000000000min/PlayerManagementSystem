package playermanagementsystem;

public class Player {
	String name;
    int number;
    String email;
    String phone;
    
    Player(){
    	
    }
    
    public Player(String name, int number) {
    	this.name = name;
    	this.number = number;
    }
    public Player(String name, int number, String email, String phone ) {
    	this.name = name;
    	this.number = number;
    	this.email = email;
    	this.phone = phone;
    }
 	public void printInfo() {
		System.out.println("name : " + name + "\n" + "number : " + number + "\n" + "email : " + email + "\n" + "phone : 1" + phone);
		
	}
}
