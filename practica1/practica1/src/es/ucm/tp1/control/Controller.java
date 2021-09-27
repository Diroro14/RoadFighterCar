package es.ucm.tp1.control;

import java.util.Scanner;

import es.ucm.tp1.logic.Game;
import es.ucm.tp1.view.GamePrinter;
import es.ucm.tp1.logic.Player;

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
	
	private GamePrinter printer;

	public Controller(Game game, Scanner scanner) {
		this.game = game;
		this.scanner = scanner;
		this.printer = new GamePrinter(game);
	}

	public void printGame() {
		System.out.println(printer);
	}
	

	public void printEndMessage() {
		System.out.println(printer.endMessage());
	}

	public void run() {
		while(!game.checkEnd()) {
		System.out.println(PROMPT);
		switch(scanner.next()) {
		case "h":
			System.out.println(HELP);
			break;
		case "i":
			//print coinList & print obstacleList
			break;
		case "n":
			game.getPlayer().forward();
			printer.toString();
			break;
		case "":
			game.getPlayer().forward();
			printer.toString();
			break;
		case "q":
			game.getPlayer().dodge(1);
			printer.toString();
			break;
		case "a":
			game.getPlayer().dodge(-1);
			printer.toString();
			break;
		case "e":
			System.exit(0);
			break;
		case "r":
			//TODO
			break;
		case "t":
			Game.toggleTest();
			break;
			default:
				System.out.println(UNKNOWN_COMMAND_MSG);
				Game.update();
				break;
		
		}
		}
		printer.endMessage();
	}
}
