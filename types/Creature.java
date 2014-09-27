package types;

public class Creature extends Type{

	private int creatureID;
	
	/*
	 * Creature IDs:
	 *    0 = "Pixie"
	 *    1 = "Sphinx"
	 *    2 = "Wisp"
	 *    3 = "Siren"
	 *    4 = "Dragon"
	 *    5 = "Unicorn"
	 */
	
	/*
	 * Setters
	 */
	
	public void setCombatModifiers(int typeID) {
		switch (typeID) {
		case 0: weakAgainst = 1;
				strongAgainst = 3;
				break;
				
		case 1: weakAgainst = 2;
				strongAgainst = 0;
				break;
				
		case 2: weakAgainst = 3;
				strongAgainst = 1;
				break;
		
		case 3: weakAgainst = 0;
				strongAgainst = 2;
				break;
			
		case 4:	weakAgainst = 6;
        		strongAgainst = 6;
        		break;
			
		case 5: weakAgainst = 6;
				strongAgainst = 6;
				break;
		}
	}
	
	/*
	 * Getters
	 */
	
	public int getCreatureID() {
		return creatureID;
	}
	
	/*
	 * Constructor
	 */
	
	public Creature(String typeName, int ID) {
		setTypeName(typeName);
		creatureID = ID;
		setCombatModifiers(creatureID);
	}
	
}
