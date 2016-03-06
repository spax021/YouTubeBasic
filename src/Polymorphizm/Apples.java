package Polymorphizm;

public class Apples {

	public static void main(String[] args) {
		//AnimalList.class
//		AnimalList ALO = new AnimalList();
//		Dog d = new Dog();
//		Fish f = new Fish();
//		ALO.add(d);
//		ALO.add(f);
		
		Animal[] theList = new Animal[2];
		Dog d = new Dog();
		Fish f = new Fish();
		
		theList[0] = d;
		theList[1] = f;
		
		for(Animal x : theList){
			x.noise();
		}
		
	}
}
