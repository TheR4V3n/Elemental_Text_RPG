package combat;

import types.Creature;
import types.Element;
import characters.Player;
import characters.Enemy;
import elemental.Elemental;

public class Combat {
	
	static Element earth = new Element("Earth", 0);
	static Creature pixie = new Creature("Pixie", 0);
	static Elemental elemental = new Elemental("zhkdfah", earth, pixie, 1, 1, 1);
	
	public static Player player = new Player("Fred");
	public static Enemy enemy = new Enemy("Steve");
	
	public static String printEnemyStats() {
		enemy.setActiveElemental(elemental);
		Elemental enemyElemental = enemy.getActiveElemental();
		String text = enemy.getCharacterName() + "\nLife " + enemy.getCurHealth() + "\n\n" + enemyElemental.getElementalName() + "\nHealth  " + enemyElemental.getCurHealth() + "\nAttack  " + enemyElemental.getCurAttack() + "\nDefense " + enemyElemental.getCurDefense();
		return text;
	}
	
	public static String printPlayerStats() {
		player.setActiveElemental(elemental);
		Elemental playerElemental = player.getActiveElemental();
		String text = player.getCharacterName() + "\nLife " + player.getCurHealth() + "\n\n" + playerElemental.getElementalName() + "\nHealth  " + playerElemental.getCurHealth() + "\nAttack  " + playerElemental.getCurAttack() + "\nDefense " + playerElemental.getCurDefense() + "\n";
		return text;
	}
	
}
