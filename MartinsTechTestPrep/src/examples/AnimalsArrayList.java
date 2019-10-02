package examples;

import java.util.ArrayList;

/**
 * 
 * @author MCN17134884
 *
 */
public class AnimalsArrayList {

	/**
	 * Main method which runs on start-up, is used to call other class methods
	 * 
	 * @param string array of args
	 */
	public static void main(String[] args) {

		//instance variables
		AnimalsArrayList animalsArrayList = new AnimalsArrayList();
		ArrayList<Animal> resultArray = new ArrayList<Animal>();
		boolean result;

		//create array and print result
		resultArray = animalsArrayList.createAnimalArrayList();
		for (int index = 0; index < resultArray.size(); index++) {
			System.out.println(resultArray.get(index).getName());
		}
		System.out.println("\n");
		
		//add to original array and print result
		resultArray = animalsArrayList.addToAnimalArrayList();
		for (int index = 0; index < resultArray.size(); index++) {
			System.out.println(resultArray.get(index).getName());
		}
		System.out.println("\n");
		
		//remove elephant from amended array
		resultArray = animalsArrayList.removeAnimalFromArrayList();
		for (int index = 0; index < resultArray.size(); index++) {
			System.out.println(resultArray.get(index).getName());
		}
		System.out.println("\n");
		
		//remove everything from amended array
		resultArray = animalsArrayList.removeAllAnimalsFromArrayList();
		System.out.println("\n");
		
		//check that array is empty
		result = animalsArrayList.isEmptyArrayList(resultArray);
		System.out.println("In Main - Is Animal ArrayList Empty? " + result);

	}

	/**
	 * Method to check whether an animal arraylist is empty
	 * @param resultArray
	 * @return boolean
	 */
	public boolean isEmptyArrayList(ArrayList<Animal> resultArray) {
		
		boolean result;
		
		result = resultArray.isEmpty();
		
		return result;
	}

	/**
	 * Method to return an empty animal arraylist
	 * @return arraylist of animals
	 */
	public ArrayList<Animal> removeAllAnimalsFromArrayList() {

		ArrayList<Animal> animalArray = new ArrayList<Animal>();
		animalArray = removeAnimalFromArrayList();
		animalArray.removeAll(animalArray);
		System.out.println("Remove All Method - Animal ArrayList Should now be empty");

		return animalArray;
	}

	/**
	 * Method to remove an animal from an arraylist of animals
	 * @return arraylist of animals
	 */
	public ArrayList<Animal> removeAnimalFromArrayList() {

		ArrayList<Animal> animalArray = new ArrayList<Animal>();
		animalArray = addToAnimalArrayList();

		for (int index = 0; index < animalArray.size(); index++) {
			if (animalArray.get(index).getName() == "Elephant") {
				animalArray.remove(index);
			}
			/*
			 * test code, commented out for future testing else {
			 * System.out.println("Elephant not found"); }
			 */
		}
		System.out.println("Remove Method");

		return animalArray;
	}

	/**
	 * Method to add to an arraylist of animals
	 * @return arraylist of animals
	 */
	public ArrayList<Animal> addToAnimalArrayList() {

		ArrayList<Animal> animalArray = new ArrayList<Animal>();

		animalArray = createAnimalArrayList();
		animalArray.add(new Animal("Dog"));
		animalArray.add(new Animal("Cat"));
		System.out.println("Add Method");

		return animalArray;
	}

	/**
	 * Method to create an arraylist
	 * @return arraylist of animals
	 */
	public ArrayList<Animal> createAnimalArrayList() {

		ArrayList<Animal> animalArray = new ArrayList<Animal>();

		animalArray.add(new Animal("Elephant"));
		animalArray.add(new Animal("Rhino"));
		animalArray.add(new Animal("Lion"));
		System.out.println("Create Method");

		return animalArray;
	}

}