package hw10Abstraction;

public class ColumbiaUniversity extends MedicalSchool {

	/*
	 * 'Extends' is used for class inheritance in Java. A regular class can inherit
	 * another regular class or an abstract class using 'extends'. It can also
	 * implement one or more interfaces using 'implements'. Multiple inheritance is
	 * not possible for regular classes in terms of class inheritance (extends).
	 */

	// public abstract void chemistry();
	// This is an Abstract method; It's not possible in a regular class

	public void biology() {
		System.out.println(" This is the Biology Class at Columbia University.");
	}

	public ColumbiaUniversity() {
		System.out.println("Default constructor of ColumbiaUniversity class.");
	}

}
