package hw10Abstraction;

public abstract class MedicalSchool extends NursingSchool {
	public abstract void anatomyLab();

	/*
	 * 'Extends' is used for abstract class inheritance in Java. An abstract class
	 * can inherit another abstract class using 'extends'. It can also inherit a
	 * regular class or an interface using 'extends'. Multiple inheritance is
	 * possible for abstract classes.
	 */

	public void biochemistryLab() {
		System.out.println("This method is from MedicalSchool class");
	}

	public MedicalSchool() {
		System.out.println("This constructor is from MedicalSchool class.");
	}
}
