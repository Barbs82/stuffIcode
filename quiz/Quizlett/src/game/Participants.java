package game;

import java.util.ArrayList;
import java.util.Scanner;

public class Participants
{
	public ArrayList<Player> players;
	public int numberOfPlayers = 0;
	
	public Participants()
	{
		players = new ArrayList<>();
	}
	
	public void setNumberOfPlayers()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Anzahl der Spieler ein:");
		numberOfPlayers = scanner.nextInt();
		scanner.close();
	}
	
	public void addPlayer()
	{	
		int playersInSession = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(playersInSession <=numberOfPlayers)
		{	Player player = new Player(scanner.next());
			players.add(player);
			numberOfPlayers ++;
			System.out.println(player.getName() + " wurde zugefügt.");
		}
		scanner.close();
	}
	
	public void getPlayerNames()
	{
		for (Player p : players)
		{
			System.out.println(p.getName());
		}
	}
	
	
}
