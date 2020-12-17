package game;

import java.util.Scanner;

public class Start
{

	public static void main(String[] args)
	{
		
		startNewGame();

	}
	
	public static void startNewGame()
	{
		Participants list = new Participants();
		list.setNumberOfPlayers();
		list.addPlayer();
		
	}
	
	
}
