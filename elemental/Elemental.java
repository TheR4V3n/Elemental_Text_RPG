package elemental;

import types.*;

public class Elemental {
	
	private String elementalName;
	private Element element;
	private Creature creature;
	private int maxHealth, maxAttack, maxDefense;
	private int curHealth, curAttack, curDefense;
	
	/*
	 * Setters
	 */
	
	//Sets Elemental's name
	public void setElementalName(String name) {
		elementalName = name;
 	}
	
	//Sets Elemental's Elements and Element ID
	public void setElement(Element Element) {
		element = Element;
	}
	
	//Sets Creature type and Creature ID
	public void setCreature(Creature Creature) {
		creature = Creature;
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
	public Element getElement() {
		return element;
	}
	
	//Get Element ID
	public int getElementID() {
		return element.getElementID();
	}
	
	//Get Elemental's Creature type
	public Creature getCreature() {
		return creature;
	}
	
	//Get Creature ID
	public int getCreatureID() {
		return creature.getCreatureID();
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
	
	/*
	 * Constructor
	 */
	
	public Elemental(String name, Element element, Creature creature, int elementID, int health, int attack, int defense) {
		setElementalName(name);
		setElement(element);
		setCreature(creature);
		setStats(health, attack, defense);
	}
	
}
