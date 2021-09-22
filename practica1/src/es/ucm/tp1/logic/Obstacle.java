package es.ucm.tp1.logic;

public class Obstacle {
	
private static int x;
private static int y;
private static int amount;
private Game game;

public Obstacle(int x, int y, int amount, Game game) {
	this.x = x;
	this.y = y;
	this.amount = amount;
	this.game = game;
}
}
