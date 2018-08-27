package MyHairyAnimals;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		Animal animal3 = new Animal();
		Animal animal4 = new Animal();
		Animal animal5 = new Animal(4,true,"vegetation", "Mr.Ed");
		
		System.out.println(animal5.getDiet());
		System.out.println(animal5.getLegs());
		System.out.println(animal5.isMammal());
		System.out.println("This horses' name is: " + animal5.getName());
		
		
	}

}
