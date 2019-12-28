package Players;

public class Player {

	
	private String playerName;
	private String playerPosition;
	public Player(String playerName, String playerPosition) {
		super();
		this.playerName = playerName;
		this.playerPosition = playerPosition;
		System.out.println(playerName+" plays "+playerPosition+" Position ");
	}
}
