package types;

public class Title extends Type{

	private int titleID;
	
	/*
	 * Setters
	 */
	
	public int setTitleID(String typeName) {
		int i;
		String[] typeNames = {"Ditzy", "Cryptic", "The Seer of Fates", "Flirtatous", "King of the Mountain", "Avenger of Injustice"};
		for(i=0;i==(typeNames.length-1);i++) {
			if(typeNames[i]==typeName) {
				return i;
			}
		}
		return typeNames.length;
	}
	
	/*
	 * Getters
	 */
	
	public int getTitleID() {
		return titleID;
	}
}
