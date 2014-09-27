package types;

public class Attack extends Type{
	
	private int attackID;
	//private int minDamage, maxDamage;
	
	/*
	 * Element IDs:
	 *    0 = "Earth"
	 *    1 = "Fire"
	 *    2 = "Air"
	 *    3 = "Water"
	 *    4 = "Annihilation"
	 *    5 = "Creation"
	 * Creature IDs:
	 *    6 = "Pixie"
	 *    7 = "Sphinx"
	 *    8 = "Cyclops"
	 *    9 = "Siren"
	 *    10 = "Dragon"
	 *    11 = "Unicorn"
	 */
	
	/*
	 * Setters
	 */
	
	public void setAttackName() {
		switch (attackID) {
		case 0: typeName = "Earthen Spires";
				break;
		case 1: typeName = "Windlash";
				break;
		case 2: typeName = "Flame Deluge";
		        break;
		case 3: typeName = "Rouge Wave";
				break;
		case 4: typeName = "OBLITERATE!";
		        break;
		case 5: typeName = "Addition thorugh Subtraction";
			    break;
		case 6: typeName = "Tricky";
				break;
		case 7: typeName = "The Riddle of Time";
				break;
		case 8: typeName = "*wisp-per*";
				break;
		case 9: typeName = "Seducer";
		 	 	break;
		case 10: typeName = "Ruler of his Kingdom";
			     break;
		case 11: typeName = "Horn Laser";
		         break;
		}
	}
	
	/*
	 * Getters
	 */
	
	public String getAttackName() {
		return typeName;
	}
	
	public int getAttackType() {
		return attackID;
	}
	
	/*public int minDamage() {
		return minDamage;
	}*/
	
	/*public int maxDamage() {
		return maxDamage;
	}*/
	
	public Attack(int attackType/*, int minDam, int maxDam*/) {
		attackID = attackType;
		setAttackName();
		//minDamage = minDam;
		//maxDamage = maxDam;
	}
}
