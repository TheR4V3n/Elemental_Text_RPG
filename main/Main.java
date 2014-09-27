package main;

import types.Creature;
import types.Element;
import characters.Enemy;
import characters.Player;
import elemental.Elemental;

public class Main {

	static Player player = new Player("sdhakjf");
	static Enemy enemy = new Enemy("shgdakhf");
	static Element earth = new Element("Earth", 0);
	static Creature pixie = new Creature("Pixie", 0);
	static Elemental elemental = new Elemental("zhkdfah", earth, pixie, 1, 1, 1);
	
	public static void main(String[] args) {
		//player.setActiveElemental(elemental);
		//enemy.setActiveElemental(elemental);
		
		//Combat combat1 = new Combat();
		//combat1.beginCombat(player, enemy);
	}

}
