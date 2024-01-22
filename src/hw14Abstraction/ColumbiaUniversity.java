package hw14Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	/*
	 * The "extends" keyword is used for regular class inheritance. Example: class B
	 * extends A {...} Here, B extends A, indicating that B inherits from A.
	 */

	/*
	 * A regular class can extend another regular class using the "extends" keyword.
	 * Example: class ColumbiaUniversity extends NYUniversity {...} Here,
	 * ColumbiaUniversity extends NYUniversity, representing regular class
	 * inheritance.
	 */

	/*
	 * A regular class can extend an abstract class using the "extends" keyword.
	 * Example: class ColumbiaUniversity extends MedicalSchool {...} Here,
	 * ColumbiaUniversity extends MedicalSchool, demonstrating regular class
	 * inheriting from an abstract class.
	 */

	/*
	 * A regular class can implement an interface using the "implements" keyword.
	 * Example: class ColumbiaUniversity implements University {...} Here,
	 * ColumbiaUniversity implements University, indicating regular class
	 * implementing an interface.
	 */

	/*
	 * A regular class can implement multiple interfaces using the "implements"
	 * keyword. Example: class ColumbiaUniversity implements University,
	 * VocationalSchool {...} Here, ColumbiaUniversity implements both University
	 * and VocationalSchool, showing multiple interface implementation.
	 */

	/*
	 * A regular class can have single inheritance for another class or abstract
	 * class (using "extends") and can implement multiple interfaces (using
	 * "implements"). Example: class ColumbiaUniversity extends MedicalSchool
	 * implements University, VocationalSchool {...} Here, ColumbiaUniversity
	 * extends MedicalSchool and implements both University and VocationalSchool,
	 * demonstrating both types of inheritance.
	 */

	public void biology() {
		System.out.println(" This is the Biology Class at Columbia University.");
	}

	public ColumbiaUniversity() {
		System.out.println("Default constructor of ColumbiaUniversity class.");
	}

	@Override
	public void commonRoom() {
		System.out.println("Common Room method from College Interface");

	}

	@Override
	public void laboratory() {
		System.out.println("Laboratory method from College Interface");

	}

	@Override
	public void languageClub() {
		System.out.println("Language club method from College Interface");

	}

	@Override
	public void emergencyRoom() {
		System.out.println("Emergency Room method from Hospital Interface");

	}

	@Override
	public void surgeryRoom() {
		System.out.println("Surgery Room method from Hospital Interface");

	}

	@Override
	public void teachercafeteria() {
		System.out.println("Teacher Cafeteria method from Hospital Interface");

	}

	@Override
	public void lawSchoolInfo() {
		System.out.println("Law School method from Law School Interface");
	}

	@Override
	public void vocationalInfo() {
		System.out.println("Vocational method from Vocational Interface");
	}

	@Override
	public void classSize() {
		System.out.println("Class Size method from University Interface");
	}

	@Override
	public void playGround() {
		System.out.println("Play Ground method from University Interface");

	}

	@Override
	public void teacher() {
		System.out.println("Teacher method from University Interface");
	}

	@Override
	public void anatomyLab() {
		System.out.println("Anatomy Lab method from Medical School Abstract class");

	}

	@Override
	public void hygiene() {
		System.out.println("Hygiene method from Nursing School Abstract class");

	}

}
