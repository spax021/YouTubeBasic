package Polymorphizm;

public class AnimalList {

	private Animal[] theList = new Animal[5];
	private int i = 0;
	
	public void add(Animal a){
		if(i < theList.length){
			theList[i] = a;
			System.out.println("Animal is added at index: " + i);
			i++;
		}
	}
	
}
