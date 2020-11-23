package game;

import java.util.ArrayList;

public class Participants
{
	public ArrayList<Player> players = new ArrayList<>();
	public int numberOfPlayers = 0;
	
	public Participants()
	{
		
	}
	
	public void addPlayer(Player player)
	{
		players.add(player);
		numberOfPlayers ++;
	}
	
	
	
}
