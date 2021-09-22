package es.ucm.tp1.logic;

import es.ucm.tp1.control.Level;

public class Game {

	private Long seed;
	private Level level;
	public Player player;
	
	public Game (Long Seed, Level level) { 
		this.seed = seed;
		this.level = level;
	}
	
	public boolean checkEnd(){
		//TODO
		return true;
	}
	
	public static void update() {
		//TODO
	}
	
	public static void toggleTest() {
		
	}
	
	public static String getGameStatus() {
		
		return "";
	}
	
}
