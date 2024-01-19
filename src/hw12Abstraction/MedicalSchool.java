package hw12Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	public abstract void anatomyLab();

	/*
	 * The "extends" keyword is used for abstract class inheritance. Example:
	 * abstract class B extends A {...} Here, B extends A, indicating that B
	 * inherits from A.
	 */

	/*
	 * An abstract class can extend another abstract class using the "extends"
	 * keyword. Example: abstract class MedicalSchool extends NursingSchool {...}
	 * Here, MedicalSchool extends NursingSchool, representing abstract class
	 * inheritance.
	 */

	/*
	 * An abstract class can extend a regular class using the "extends" keyword.
	 * Example: abstract class MedicalSchool extends RegularClass {...} Here,
	 * MedicalSchool extends RegularClass, demonstrating abstract class inheriting
	 * from a regular class.
	 */

	/*
	 * An abstract class can implement an interface using the "implements" keyword.
	 * Example: abstract class MedicalSchool implements LawSchool {...} Here,
	 * MedicalSchool implements LawSchool, indicating abstract class implementing an
	 * interface.
	 */

	/*
	 * An abstract class can have single inheritance for another class or abstract
	 * class (using "extends") and can implement multiple interfaces (using
	 * "implements"). Example: abstract class MedicalSchool extends NursingSchool
	 * implements LawSchool {...} Here, MedicalSchool extends NursingSchool and
	 * implements LawSchool, showing both types of inheritance.
	 */

	public void biochemistryLab() {
		System.out.println("This method is from MedicalSchool class");
	}

	public MedicalSchool() {
		System.out.println("This constructor is from MedicalSchool class.");
	}
}
