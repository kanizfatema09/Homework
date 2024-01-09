package hw08Abstraction;

public abstract class MedicalSchool {
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This method is from MedicalSchool class");
	}

	public MedicalSchool() {
		System.out.println("This constructor is from MedicalSchool class.");
	}
}
