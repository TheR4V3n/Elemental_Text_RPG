package elements;

public class Element {
	
	private String elementName;
	private String strongAgainst;
	private String weakAgainst;
	
	public Element(String eName) {
		elementName = eName;
	}
	
	/*
	 * Setters
	 */
	
	public void setElementName(String name) {
		elementName = name;
	}
	
	public void setCombatModifiers(String strengthName, String weaknessName) {
		strongAgainst = strengthName;
		weakAgainst = weaknessName;
	}
	
	/*
	 * Getters
	 */
	
	public String getElementName() {
		return elementName;
	}
	
	public String getWeakness() {
		return weakAgainst;
	}
	
	public String getStrength() {
		return strongAgainst;
	}
	
}
