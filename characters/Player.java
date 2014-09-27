package characters;

import elemental.Elemental;
import types.Creature;
import types.Element;

public class Player extends Character {

	public Element earth = new Element("Earth", 0);
	public Creature pixie = new Creature("Pixie", 0);
	public Elemental elemental = new Elemental("Bob", earth, pixie, 25, 12, 14);
	
	public Player(String name) {
		super(name);
		setActiveElemental(elemental);
	}	
	
	public static Player player = new Player("Fred");
	
}
