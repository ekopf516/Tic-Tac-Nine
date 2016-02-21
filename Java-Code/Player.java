
public class Player {
	private String name;
	private Player player;
	private int gamesWon;
	private int gamesLost;
	
	public void setGamesWon() {
		this.gamesWon = gamesWon + 1;
		
	}

	public void setGamesLost() {
		this.gamesLost = gamesLost + 1;
	}

	public int getGamesWon() {
		return gamesWon;
	}

	public int getGamesLost() {
		return gamesLost;
	}

	public Player(String name){
		this.gamesWon = 0;
		this.gamesLost = 0;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	
}
