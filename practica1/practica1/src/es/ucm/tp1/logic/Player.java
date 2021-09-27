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
	

	
	public void forward() {
		this.x = this.x +1;
	}
	
	public void dodge(int dir) {
		if(this.behaviour + dir < 2 && -2 < this.behaviour + dir) {
			this.behaviour = this.behaviour + dir;
		}
	}
}
	//1 -> Arriba	0 -> Centro		-1 -> Abajo
