package es.ucm.tp1.logic;

public class Player {

	private int x = 0;
	private int behaviour = 0;
	private int speed = 1;
	private int resistance;
	
	private static void update(Player player) {
		//TODO
	}
	
	public Player(int x, int behaviour, int speed, int resistance){
		this.x = x;
		this.behaviour = behaviour;
		this.speed = speed;
		this.resistance = resistance;
	}
	

	
	public static void forward(Player player) {
		player.x = player.x +1;
	}
	
	public static void dodge(Player player, int dir) {
		if(player.behaviour + dir < 2 && -2 < player.behaviour + dir) {
			player.behaviour = player.behaviour + dir;
		}
	}
}
	//1 -> Arriba	0 -> Centro		-1 -> Abajo
