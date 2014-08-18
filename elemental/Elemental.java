package elemental;

import elements.Element;

public class Elemental {
	
	private String elementalName;
	private Element[] elements;
	private int maxHealth, maxAttack, maxDefense;
	private int curHealth, curAttack, curDefense;
	
	/*
	 * Constructor
	 */
	
	public Elemental(String name, Element[] elements, int health, int attack, int defense) {
		setElementalName(name);
		setElements(elements);
		setStats(health, attack, defense);
	}
	
	/*
	 * Setters
	 */
	
	//Sets Elemental's name
	public void setElementalName(String name) {
		elementalName = name;
 	}
	
	//Sets Elemental's elements
	public void setElements(Element[] Elements) {
		elements = Elements;
	}
	
	//Sets the Elemental's base stats
	public void setStats(int health, int attack, int defense) {
		maxHealth = health;
	    maxAttack = attack;
	    maxDefense = defense;
	    curHealth = maxHealth;
	    curAttack = maxAttack;
	    curDefense = maxDefense;
	}
	
	//Increases/Decreases Elemental's current health
	public void setCurHealth(int modifier) {
		curHealth = curHealth + modifier;
	}
	
	//Increases/Decreases Elemental's current attack
	public void setCurAttack(int modifier) {
		curAttack = curAttack + modifier;
	}
	
	//Increases/Decreases Elemental's current defense
	public void setCurDefense(int modifier) {
		curDefense = curDefense + modifier;
	}
	
	/*
	 * Getters
	 */
	
	//Get Elemental's name
	public String getElementalName() {
		return elementalName;
	}
	
	//Get Elemental's elements
	public Element[] getElements() {
		return elements;
	}
	
	//Returns max health of the Elemental
	public int getMaxHealth() {
		return maxHealth;
	}
	
	//Returns max attack of the Elemental
	public int getMaxAttack() {
		return maxAttack;
	}
	
	//Returns max defense of the Elemental
	public int getMaxDefense() {
		return maxDefense;
	}
	
	//Returns current health of the Elemental
	public int getCurHealth() {
		return curHealth;
	}
	
	//Returns current attack of the Elemental
	public int getCurAttack() {
		return curAttack;
	}
	
	//Returns current defense of the Elemental
	public int getCurDefense() {
		return curDefense;
	}
	
}
