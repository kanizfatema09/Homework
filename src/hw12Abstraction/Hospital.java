package hw12Abstraction;

public interface Hospital {
	public void emergencyRoom();

	public void surgeryRoom();

	public void teachercafeteria();

	default void morgue() {
		System.out.println("Accessing the hospital morgue.");
	}

	static void pharmacy() {
		System.out.println("Visiting the hospital pharmacy for medications.");
	}
}
