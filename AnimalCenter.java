


import java.util.Random;
public class AnimalCenter {
	Dog dog1 = new Dog();
	Dog dog2 = new Dog();
	Dog dog3 = new Dog();
	Dog dog4 = new Dog();
	Dog dog5 = new Dog();
	
	Dog [] dogs = {dog1, dog2, dog3, dog4, dog5};
	Dog [] dogsOnSale = { new Dog(), new Dog(), new Dog()};
	
	String [] names = {"tata", "jimmy", "tommy", "willie", "sparkles"};
	
	public AnimalCenter() {
		
}
	public void renameDogs() {
	Random rand = new Random(); }
	for(Dog dog: dogs) {
		int randIndex = rand.nextInt(dogs.length);
		dog.setName(names[randIndex]);
		System.out.println(dog);
	}
}

public static void main (String[] args) {
	AnimalCenter  ac = new AnimalCenter();
	ac.renameDogs()
}
