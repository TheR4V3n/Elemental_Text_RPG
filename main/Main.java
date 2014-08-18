package main;

import combat.*;
import characters.*;

public class Main {

	public static void main(String[] args) {
		Player player = new Player("good name");
		Enemy enemy = new Enemy("bad name");
		Combat.beginCombat(player, enemy);
	}
	
}
