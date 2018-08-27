package MyHairyAnimals;

	public class Animal {
	
	public Animal(){
		
	}
	
	private int legs;
	private boolean mammal;
	private String diet;
	private String name;
	
	public Animal(int legs, boolean mammal, String diet, String name) {
		this.legs=legs;
		this.mammal=mammal;
		this.diet=diet;
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public boolean isMammal() {
		return mammal;
	}
	public void setMammal(boolean mammal) {
		this.mammal = mammal;
	}
	public String getDiet() {
		return diet;
	}
	public void setDiet(String diet) {
		this.diet = diet;
		
	}
	
}
