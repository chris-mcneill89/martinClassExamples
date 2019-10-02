package examples;
/**
 * 
 * @author MCN17134884
 *
 */
public class Student {
	//instance variables
	private String name;
	private int age;
	public static int numberOfStudents;
	
	//getters & setters
	
	/**
	 * get name property
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * set name property
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * get age property
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * set age property
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * Static method to which gets numberOfStudents variable
	 * @return int
	 */
	public static int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	//constructors
	
	/**
	 * Constructor that takes String and int params
	 * @param name
	 * @param age
	 */
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		numberOfStudents++;
	}
	
}
