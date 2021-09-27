package es.ucm.tp1.logic;

import es.ucm.tp1.control.Level;

public class Game {

	private Long seed;
	private Level level;
	private Player player;
	
	public Game (Long Seed, Level level) { 
		this.seed = seed;
		this.level = level;
		this.player = new Player(0, 0, 1, 3);
	}
	
	public Player getPlayer() {
		
		return this.player;
	}
	
	public int getRoadWidth() {
		return this.level.getWidth();
	}
	
	public String positionToString(int x, int y) {
		return "x " + "y";
	}
	
	public int getVisibility() {
		return this.level.getVisibility();
	}
	
	public boolean checkEnd(){
		//TODO
		return false;
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
