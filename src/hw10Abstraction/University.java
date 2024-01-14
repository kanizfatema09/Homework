package hw10Abstraction;

public interface University extends College, Hospital {
	/*
	 * For Interface "University" extending "College" and "Hospital": Inheritance
	 * Keywords: 'extends' is used for interface inheritance in Java. An interface
	 * can inherit multiple other interfaces using 'extends'. No inheritance is
	 * possible with regular classes or abstract classes using 'extends'. Multiple
	 * inheritance is allowed for interfaces, and in this case, 'University' extends
	 * 'College' and 'Hospital'.
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
