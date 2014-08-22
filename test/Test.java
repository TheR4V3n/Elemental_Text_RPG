package test;

import types.*;
import elemental.*;

public class Test {
	
	static Deck deck = new Deck();
	static Element earth = new Element("Earth");
	static Element air = new Element("Air");
	static Element fire = new Element("Fire");
	static Creature dragon = new Creature("Dragon");
	static Creature pixie = new Creature("Pixie");
	static Creature unicorn = new Creature("Unicorn");
	static Elemental elemental1 = new Elemental("Larry", earth, dragon, 1, 2, 3, 4);
	static Elemental elemental2 = new Elemental("Steve", air, pixie, 1, 2, 3, 4);
	static Elemental elemental3 = new Elemental("Jim Bob", fire, unicorn, 1, 2, 3, 4);
	static Elemental[] elementals = {elemental1, elemental2, elemental3};
	
	public static void test() {
		deck.addToDeck(elementals);
		deck.printDeckContents();
		deck.sortDeck();
		deck.printDeckContents();
	}
	
}
