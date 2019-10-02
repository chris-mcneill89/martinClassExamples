package examples;

/**
 * Animal Class
 * Used in Animals ArrayList Class
 * @author MCN17134884
 *
 */
public class Animal {

	// instance variables
	private String name;

	/**
	 * getter for name property
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * setter for name property
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * default constructor
	 */
	public Animal() {
		super();
	}

	/**
	 * constructor with single string param
	 * @param name
	 */
	public Animal(String name) {
		super();
		this.name = name;
	}

}
