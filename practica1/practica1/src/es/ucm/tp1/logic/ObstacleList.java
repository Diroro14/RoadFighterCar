package es.ucm.tp1.logic;

import es.ucm.tp1.logic.Obstacle;

public class ObstacleList {
private int cap;
private Obstacle[] list;

public ObstacleList(int cap) {
	this.cap = cap;
	this.list = new Obstacle[cap];
}

}
