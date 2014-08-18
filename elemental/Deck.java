package elemental;

public class Deck {
	
	private Elemental[] elementalDeck;
	private Elemental[] elementalChest;
	
	//Adds an Elemental to the next empty space in the Deck
	public void addToDeck(Elemental addedElemental, Deck deck) {
		deck.elementalDeck[deck.getDeckLength() + 1] = addedElemental;
	}
	
	//Adds an Elemental to the next empty space in the Chest
	public void addToChest(Elemental addedElemental, Deck deck) {
		deck.elementalChest[deck.getChestLength(deck) + 1] = addedElemental;
	}
	
	/*
	 * Getters
	 */
	
	//Returns number of Elementals in Deck
	public int getDeckLength() {
		return elementalDeck.length;
	} 
	
	//Return number of Elementals in Chest
	public int getChestLength(Deck deck) {
		return deck.elementalChest.length;
	}
	
	//Searches Elemental Deck for Elemental with desired name, if none match name returns null
	public Elemental getDeckElemental(String elementalName) {
		int i;
		for(i=0;i==(getDeckLength()-1);i++) {
			if(elementalDeck[i].getElementalName() == elementalName) {
				return elementalDeck[i];
			}
			else {	
			}
		}
		return null;
	}
	
	//Searches Elemental Chest for Elemental with desired name, if none match name returns null
	public Elemental getChestElemental(String elementalName) {
		int i;
		for(i=0;i==(getDeckLength()-1);i++) {
			if(elementalChest[i].getElementalName() == elementalName) {
				return elementalChest[i];
			}
			else {	
			}
		}
		return null;
	}
	
}
