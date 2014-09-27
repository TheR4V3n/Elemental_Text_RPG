package types;

public class Element extends Type{
	
	private int elementID;
	
	/*
	 * Setters
	 */
	
	/*
	 * Element IDs:
	 *    0 = "Earth"
	 *    1 = "Fire"
	 *    2 = "Air"
	 *    3 = "Water"
	 *    4 = "Annihilation"
	 *    5 = "Creation"
	 */

	//Set weaknesses and strengths for each element
	public void setCombatModifiers(int typeID) {
		switch (typeID) {
		case 0: weakAgainst = 4;
				strongAgainst = 2;
				break;
				
		case 1: weakAgainst = 0;
				strongAgainst = 3;
				break;
				
		case 2: weakAgainst = 2;
				strongAgainst = 4;
				break;
		
		case 3: weakAgainst = 3;
				strongAgainst = 0;
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

	public int getElementID() {
		return elementID;
	}
	
	/*
	 * Constructor
	 */
	
	public Element(String typeName, int ID) {
		setTypeName(typeName);
		elementID = ID;
		setCombatModifiers(elementID);
	}
}
