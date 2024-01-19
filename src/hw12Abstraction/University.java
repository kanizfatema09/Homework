package hw12Abstraction;

public interface University extends College, Hospital {
	/*
	 * The "extends" keyword is used for interface inheritance. Example: Interface B
	 * extends A {...} Here, B extends A, indicating that B inherits from A.
	 */

	/*
	 * An interface can extend other interfaces using the "extends" keyword.
	 * Example: interface University extends College, Hospital {...} Here,
	 * University extends both College and Hospital, demonstrating multiple
	 * interface inheritance.
	 */

	/*
	 * An interface cannot directly extend a regular class or abstract class.
	 * However, a class can implement an interface using the "implements" keyword.
	 * Example: class MyClass implements MyInterface {...} Here, MyClass implements
	 * MyInterface.
	 */

	/*
	 * A class or abstract class can extend only one class (single Inheritance).
	 * But, a class or abstract class can implement multiple Interfaces (multiple
	 * inheritance). Example: class MyClass extends MyAbstractClass implements
	 * Interface1, Interface2 {...} Here, MyClass extends MyAbstractClass and
	 * implements Interface1 and Interface2.
	 */

	public void classSize();

	public void playGround();

	public void teacher();

	// public University() {
	// Constructor in interface is not allowed.
	// It will cause an error

	public default void gymnasium() {
		System.out.println("Using the university gymnasium for fitness.");
	}

	static void library() {
		System.out.println("Visiting the university library for study.");
	}

}
