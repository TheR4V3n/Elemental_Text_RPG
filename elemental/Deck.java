package elemental;

import types.*;

public class Deck {
	
	private Element Placeholder = new Element("asdf", 6);
	private Creature PlaceHolder = new Creature("sdfaad", 6);
	private Elemental placeHolder = new Elemental("Placeholder", Placeholder, PlaceHolder, 1, 1, 1);
	private Elemental[] elementalDeck = new Elemental[3];
	private Elemental[] elementalChest;
	
	//Adds an Elemental to the next empty space in the Deck
	public void addToDeck(Elemental[] addedElementals) {
		//Expands Elemental deck by 1
		System.arraycopy(addedElementals, 0, elementalDeck, 0, addedElementals.length);
	}
	
	//Adds an Elemental to the next empty space in the Chest
	public void addToChest(Elemental addedElemental) {
		elementalChest[getChestLength()] = addedElemental;
	}
	
	/*
	 * Getters
	 */
	
	//Returns Deck array
	public Elemental[] getDeck() {
		return elementalDeck;
	}
			
	//Returns number of Elementals in Deck
	public int getDeckLength() {
		if(elementalDeck.length >= 0) {
			return elementalDeck.length;
		}
		else {
			return -1;
		}
	} 
	
	//Return number of Elementals in Chest
	public int getChestLength() {
		return elementalChest.length;
	}
	
	//Searches Elemental Deck for Elemental with desired name, if none match name returns null
	public Elemental getDeckElemental(String elementalName) {
		int i;
		for(i=0;i<getDeckLength();i++) {
			if(elementalDeck[i].getElementalName().equals(elementalName)) {
				return elementalDeck[i];
			}
			else {	
			}
		}
		return placeHolder;
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
	
	//Prints names of Elementals in deck
	public void printDeckContents() {
		for(Elemental card : elementalDeck) {
			System.out.println(card.getElementalName());
		}
	}
	
	//Basic bubble sort sorts Deck ONLY according to element ID
	public void sortDeck() {
		//Denotes when sorting has been complete 
		boolean isSorted = false;
		
		//Denotes a switch has occurred during the for loop
		boolean switchOccur = false;
		int i;
		
		//Holds the first Elemental object so it is not lost during the switch
		Elemental placeholder;
		if(getDeckLength() > 1) {
			while(isSorted == false) {
				switchOccur = false;
				for(i=0;i<(getDeckLength()-1);i++) {
					if(elementalDeck[i].getElementID() > elementalDeck[i+1].getElementID()) {
						placeholder = elementalDeck[i];
						elementalDeck[i] = elementalDeck[i+1];
						elementalDeck[i+1] = placeholder;
						switchOccur = true;
					}
				}	
			//If no switch occurred in the iteration of the for loop, the sort is complete 
				if (switchOccur == false) {
					isSorted = true;
				}
			}
		}
	}
	
	//Basic bubble sort sorts Chest ONLY according to element ID
	public void sortChest() {
		//Denotes when sorting has been complete 
		boolean isSorted = false;
		
		//Denotes a switch has occurred during the for loop
		boolean switchOccur = false;
		int i;
		
		//Holds the first Elemental object so it is not lost during the switch
		Elemental placeholder;
		while(isSorted == false) {
			switchOccur = false;
			for(i=0;i==(getDeckLength()-1);i++) {
				if(elementalChest[i].getElementID()>elementalChest[i+1].getElementID()) {
					placeholder = elementalChest[i];
					elementalChest[i] = elementalChest[i+1];
					elementalChest[i+1] = placeholder;
					switchOccur = true;
				}
			}
			//If no switch occurred in the iteration of the for loop, the sort is complete 
			if (switchOccur == false) {
				isSorted = true;
			}
		}
	}
	
}
