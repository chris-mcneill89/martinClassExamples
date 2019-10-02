package examples;
/**
 * 
 * @author MCN17134884
 *
 */
public class StudentEnrolment {

	/**
	 * main method which runs on start up
	 * @param args
	 */
	public static void main(String[] args) {
		
		Student studentFirst = new Student("Martin", 18);
		Student studentSecond = new Student("Chris", 30);
		Student studentThird = new Student("Stuart", 22);
		
		System.out.println(Student.numberOfStudents);
		System.out.println(Student.getNumberOfStudents());

	}

}
