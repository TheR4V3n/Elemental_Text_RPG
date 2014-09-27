package elemental;

import types.*;

public class Elemental {
	
	private String elementalName;
	private Element element;
	private Creature creature;
	private Title title;
	private Attack[] attacks = new Attack[2];
	private int maxHealth, maxAttack, maxDefense;
	private int curHealth, curAttack, curDefense;
	
	/*
	 * Element IDs:
	 *    0 = "Earth"
	 *    1 = "Fire"
	 *    2 = "Air"
	 *    3 = "Water"
	 *    4 = "Annihilation"
	 *    5 = "Creation"
	 */
	
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
	
	//Sets Title and Title ID
	public void setTitle(Title Title) {
		title = Title;
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
	
	public void setAttacks() {
		attacks[0] = new Attack(getElementID());
		attacks[1] = new Attack(getCreatureID() + 6);
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
	
	//Get Elemental's Title
	public Title getTitle() {
		return title;
	}
	//Get Title ID
	public int getTitleID() {
		return title.getTitleID();
	}
	
	//Gets chosen Attack from attacks[]
	public Attack getAttack(int cellID) {
		return attacks[cellID];
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
	
	public Elemental(String name, Element element, Creature creature, int health, int attack, int defense) {
		setElementalName(name);
		setElement(element);
		setCreature(creature);
		setStats(health, attack, defense);
		setAttacks();
	}
	
}
