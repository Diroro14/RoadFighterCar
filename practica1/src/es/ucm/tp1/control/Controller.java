package es.ucm.tp1.control;

import java.util.Scanner;

import es.ucm.tp1.logic.*;

public class Controller {

	private static final String PROMPT = "Command > ";

	private static final String UNKNOWN_COMMAND_MSG = "Unknown command";

	/* @formatter:off */
	private static final String[] HELP = new String[] {
		"Available commands:",
		"[h]elp: show this help",
		"[i]nfo: prints gameobjet info",
		"[n]one | []: update",
		"[q]: go up",
		"[a]: go down",
		"[e]xit: exit game",
		"[r]eset: reset game",
		"[t]est: enables test mode",	
	};
	/* @formatter:off */

	private Game game;

	private Scanner scanner;

	public Controller(Game game, Scanner scanner) {
		this.game = game;
		this.scanner = scanner;
	}

	public void printGame() {
		System.out.println(game);
	}
	
	public void run() {
		switch(scanner.next()) {
		case "h":
			System.out.println("Available commands:\n"+"[h]elp: show this help\n"+"[i]nfo: prints gameobjet info\n" + "[n]one | []: update\n" + "[q]: go up\n" + "[a]: go down\n" + "[e]xit: exit game\n" + "[r]eset: reset game\n" + "[t]est: enables test mode\n");
			break;
		case "i":
			//print coinList & print obstacleList
			break;
		case "n":
			Player.forward(game.player);
			//para que funcione he puesto game.player público pero intuyo que está mal
			break;
		case "":
			Player.forward(game.player);
			break;
		case "q":
			Player.dodge(game.player, 1);
			break;
		case "a":
			Player.dodge(game.player, -1);
			break;
		case "e":
			System.exit(0);
			break;
		case "r":
			break;
		case "t":
			Game.toggleTest();
			break;
			default:
				Game.update();
				break;
				
		}
	}

}
