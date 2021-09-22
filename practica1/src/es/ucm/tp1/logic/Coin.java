package es.ucm.tp1.logic;

public class Coin {
private static int x;
private static int y;
private static int amount;
private Game game;

public Coin(int x, int y, int amount, Game game) {
	this.x  = x;
	this.y = y;
	this.amount = amount;
	this.game = game;
}

}
