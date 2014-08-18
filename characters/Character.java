package characters;

import elemental.*;

public class Character {

	private String characterName; 
	private Deck elementalDeck;
	private Elemental activeElemental;
	private int curHealth;
	final int MAXHEALTH = 50;
	
	/*
	 * Constructor
	 */
	
	public Character(String name) {
		setCharacterName(name);
	}
	
	/*
	 * Setters
	 */
	
	public void setCharacterName(String name) {
		characterName = name;
	}
	
	public void setCurHealth(int modifier) {
		curHealth = curHealth + modifier;
	}
	
	public void setActiveElemental(Elemental elemental) {
		activeElemental = elemental;
	}
	
	/* 
	 * Getters
	 */
	
	public String getCharacterName() {
		return characterName;
	}
	
	public Deck getCharacterDeck() {
		return elementalDeck;
	}
	
	public Elemental getActiveElemental() {
		return activeElemental;
	}
	
	public int getCurHealth() {
		return curHealth;
	}
	
}
