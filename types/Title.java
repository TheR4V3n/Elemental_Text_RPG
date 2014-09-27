package types;

//TODO Make titles do stuff

public class Title extends Type{

	private int titleID;
	
	/*
	 * Setters
	 */
	
	public void setTypeName(int titleID) {
		switch (titleID) {
		case 0: typeName = "The Ditzy ";
				break;
		case 1: typeName = "Cryptic";
				break;
		case 2: typeName = "The Seer of Fates";
				break;
		case 3: typeName = "Flirtatous";
				break;
		case 4: typeName = "King of the Mountain";
				break;
		case 5: typeName = "Avenger of Injustice";
				break;
		}
	}
	
	/*
	 * Getters
	 */
	
	public int getTitleID() {
		return titleID;
	}
	
	public Title(int TitleID) {
		setTypeName(TitleID);
		titleID = TitleID;
	}
	
}
