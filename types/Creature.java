package types;

public class Creature extends Type{

	private int creatureID;
	
	/*
	 * Setters
	 */
	
	public int setCreatureID(String typeName) {
		int i;
		String[] typeNames = {"Pixie", "Sphinx", "Cyclops", "Siren", "Dragon", "Unicorn"};
		for(i=0;i==(typeNames.length-1);i++) {
			if(typeNames[i]==typeName) {
				return i;
			}
		}
		return typeNames.length;
	}
	
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
	
	public Creature(String typeName) {
		setTypeName(typeName);
		setCreatureID(typeName);
		setCombatModifiers(creatureID);
	}
	
}
