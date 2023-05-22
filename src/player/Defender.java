package player;

import java.util.Scanner;

public class Defender extends FieldPlayer{
	public Defender(PlayerPosition position) {
    	super(position);
    }
	public void getUserInput(Scanner input) {
 		//번호, 이름, 팀
		setPlayerNumber(input);
		setPlayerName(input);
		setPlayerTeam(input);
		setPlayerNationalityWithYN(input);
 	}
}
